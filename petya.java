import java.util.*;
import java.lang.*;
public class petya{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

String s1 = sc.nextLine();

String s2 = sc.nextLine();
String str1 = s1.toUpperCase();
String str2 = s2.toUpperCase();
int val = str1.compareTo(str2);
if(val == 0) System.out.println(0);
else if(val>0) System.out.println(1);
else System.out.println(-1);
}
}
