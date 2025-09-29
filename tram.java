import java.util.*;
import java.lang.*;
public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = 0;
        int max =  0;
        for(int i=1; i<n+1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            capacity = (capacity - a) + b;
            max = Math.max(max, capacity);
        }
        System.out.println(max);
    }
}