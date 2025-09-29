import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		int n;
		int du;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int fl=0;
		for(int i=0;i<n;i++)
		{
		    String str;
		    str=sc.next();
		    int fre[]=new int[26];
		    for(char j:str.toCharArray())
		    {
		        fre[j-'a']+=1;
		    }
		    int d=0;
		    for(int f:fre)
		    {
		        if(f>0) d++;
		    }
            if (d == 1) { 
            System.out.println("NO");
            continue;
            };
         int dh = 0;
        for (int fr : fre) {
            if (fr / 2 > 0) dh++;
        }
    
        if (dh >= 2) {
            System.out.println("YES");
        } 
        else {
            System.out.println("NO");
        }
	}
	}
}