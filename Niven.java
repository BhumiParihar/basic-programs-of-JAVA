//program to find whether the number is a niven number or not

import java.util.Scanner;
public class Niven
{
	public static void main(String[] args) 
	{
	    int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int num=input.nextInt();
		for(int i=num;i>0;i=i/10)
		{
		    sum=sum+(i%10);
		}
		if(num%sum==0)
		{
		    System.out.println(num+" is a niven number");
		}
		else
		{
		    System.out.println(num+" is not a niven number");
		}
	}
}
