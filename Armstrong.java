// program to check whether a number is Armstrong or not.
import java.util.*;
class Main
{
	public static void main(String[] args)
	{int a,temp=0,rem=0,sum=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number to be checked");
	    a=sc.nextInt();
	    temp=a;
	    while(temp>0)
	    {
	        rem=temp%10;
	        sum+=(rem*rem*rem);
	        temp/=10;
	    }
		if(a==sum)
		System.out.println(a+"is Armstrong");
		else
		System.out.println(a+"is not Armstrong");
	}
}
