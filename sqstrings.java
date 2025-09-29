import java.util.*;

public class sqstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){

            arr[i] = sc.next();
        }
        String[] yesno = new String[n];
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() % 2 != 0){
                yesno[i] = "NO";
            }
            else{
                char[] array = arr[i].toCharArray();
                int mid = array.length / 2;
                int flag = 0;
                    for(int k = 0; k<mid; k++){
                        if(array[k] != array[mid+k]){
                            flag = 1;
                            yesno[i] = "NO";
                            break;
                        }
                    }
                    if(flag == 0) yesno[i] = "YES";
                
            }
        }
        for(String st :  yesno) System.out.println(st);
    }
}