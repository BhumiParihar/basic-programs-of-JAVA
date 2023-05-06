// Program to swap two numbers.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int a,b,temp=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a");
	    a=sc.nextInt();
	    System.out.println("enter the value of b");
	    b=sc.nextInt();
	    System.out.println("values Before Swapping "+a+" "+b);
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("values After Swapping "+a+" "+b);
	}
}
	    
	    
