import java.util.*;
import java.lang.*;
public class vanya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a>h) sum += 2;
            else sum += 1;
        }
        System.out.println(sum);
    }
}