//program to check whether a positive number is a Buzz number or not.
import java.util.*;
public class Buzz
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a positive number");
	    int a=sc.nextInt();
	    if(a%10==7)
	    System.out.println(a+" is a buzz number");
	    else if(a%7==0)
	    System.out.println(a+" is a buzz number");
	    else
	    System.out.println(a+" is not a buzz number");
	}
}
