//program to check whether a number is perfect or not.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int sum=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of a : ");
	    int a=sc.nextInt();
	    for(int i=1;i<a;i++)
	    {
	        if(a%i==0)
	        sum+=i;
	    }
	    if(a==sum)
	    System.out.println("number is perfect");
	    else
	    System.out.println("number is not perfect");
	}
}
