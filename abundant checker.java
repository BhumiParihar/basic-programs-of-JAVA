//program to check whether a number is abundant or not.
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{int sum=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value to be checked");
	    int a=sc.nextInt();
	    for(int i=1;i<a;i++)
	    {
	        if(a%i==0)
	        {
	            sum+=i;
	        }
	    }
	    if(sum>a)
		System.out.println(a+" is abundant number ");
		else
		System.out.println(a+" is not abundant number");
	}
}
