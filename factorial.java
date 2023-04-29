//program to print the factorial of a number entered by user.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int a,i,fact=1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number whose factorial has to be displayed");
	    a=sc.nextInt();
	    for(i=1;i<=a;i++) 
	    {
	        fact=fact*i;
	    }
		System.out.println("factorial of "+a+" is "+fact);
	}
}
