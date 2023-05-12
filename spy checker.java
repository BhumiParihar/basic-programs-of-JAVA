//program to check whether a positive number is spy number or not.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int temp=0,rem=0,sum=0,prod=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a positive number");
	    int a=sc.nextInt();
	    temp=a;
	    while(temp>0)
	    {
	        rem=temp%10;
	        sum+=rem;
	        prod*=rem;
	        temp/=10;
	    }
	    if(sum==prod)
		System.out.println(a+" is spy number ");
		else
		System.out.println(a+" is not spy number");
	}
}
