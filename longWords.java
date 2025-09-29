import java.util.*;

public class longWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }
        for(String str:s) {
            char[] arr = str.toCharArray();
            int count = 0;
            for(int i=1; i<arr.length-1; i++) {
                count++;
            }
            if(count>8){
                StringBuilder sb = new StringBuilder();
                sb.append(arr[0]);
                sb.append(count);
                sb.append(arr[arr.length-1]);
                System.out.println(sb);
            }
            else{
                System.out.println(str);
            }
        }
    }
}