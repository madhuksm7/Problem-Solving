import java.util.*;

public class shortsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr= new String[n];
        for(int i=0; i<n; i++){
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            sb.append(s.charAt(1));
            if(s.length()>2){
                for(int j=3; j<s.length(); j=j+2){
                    sb.append(s.charAt(j));
                }
            }
            arr[i] = sb.toString();
        }
        for(String st : arr) System.out.println(st);
    }
}