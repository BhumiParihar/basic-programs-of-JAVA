//Program to print even and odd numbers upto n limits.
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    int i,n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of upper limit");
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	       if(i%2==0)
           System.out.println(i+" is even ");
           else
           System.out.println(i+" is odd ");
	    }
	}
}
