//program to check whether a number is prime or not
import java.util.Scanner;
public class Prime
{ 
	public static void main(String[] args)
	{int flag=0,num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to be checked for prime ");
		num=input.nextInt();
		for(int i=2;i<1+num/2;i++)
		{
		    if (num%i==0)
		    {
		        flag=1;
		        break;
		    }
		}
		if (flag==0)
	    System.out.println(num+" is a prime number");
	    else
	    System.out.println(num+" is not a prime number");
	}
}
