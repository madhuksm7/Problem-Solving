import java.util.*;
public class createwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            String a = sc.next();
            String b = sc.next();
            StringBuilder s1 = new StringBuilder(a);
            StringBuilder s2 = new StringBuilder(b);
            s1.replace(0,1,String.valueOf(b.charAt(0)));
            s2.replace(0,1,String.valueOf(a.charAt(0)));
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            sb.append(" ");
            sb.append(s2);
            arr[i] = sb.toString();
        }
        for(String s:arr) System.out.println(s);
    }
}