import java.io.*;
import java.util.*;
public class ThenoofPosotionsCodeforces
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	        int n=sc.nextInt();
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int count=0;
	        for(int i=1;i<=n;i++)
	        {
	            if(i>=a+1 && i>=n-b)
	             count++;
	        }
	       System.out.println(count);
		
	}
}