//program to print sum of integers present in a number entered by user.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int a,sum=0,temp=0,rem=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter an integer");
	    a=sc.nextInt();
	    temp=a;
	    while(temp>0)
	    {
	        rem=temp%10;
	        sum+=rem;
	        temp=temp/10;
	    }
	    System.out.println("Sum of integer is "+sum);
	}
}
