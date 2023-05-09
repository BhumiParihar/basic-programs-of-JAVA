//program to print the sum of all even and odd numbers in an integer.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int temp=0,sume=0,rem=0,sumo=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		int a=sc.nextInt();
		temp=a;
		while(temp>0)
		{
		    rem=temp%10;
		    {
		        if(rem%2==0)
		        sume+=rem;
		        else
		        sumo+=rem;
		        temp=temp/10;
		    }
		}
		System.out.println("sum of all even numbers in an integer is : "+sume);
		System.out.println("sum of all odd numbers in an integer is : "+sumo);
	}
}
