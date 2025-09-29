import java.util.*;
public class lovestory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        String str = "codeforces";
        int[] count = new int[n];
        for(int i=0; i<n; i++){
            String s = arr[i];
            int c = 0;
            for(int j=0; j<s.length(); j++){
                if(!String.valueOf(s.charAt(j)).equals(String.valueOf(str.charAt(j)))){
                    c++;
                }
            }
            count[i] = c;
        }
        for(int i: count) System.out.println(i);
        
    }
}