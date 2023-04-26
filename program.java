//Program to input 2 integers and check whether both of them are multiples of 7 or not.
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{int a,b;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a : ");
	    a=sc.nextInt();
	    System.out.println("enter the valeue of b : ");
	    b=sc.nextInt();
	    if(a%7==0 && b%7==0)
		System.out.println("Both Integers are multiples of 7");
		else
		System.out.println("Both the Integers are not multiples of 7 ");
	}
}
