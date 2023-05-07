//program to find a number is automorph or not.

import java.util.Scanner;
public class Automorph
{
	public static void main(String[] args)
	{
	    int flag=0,ld=0,i,exp=0;
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int num=input.nextInt();
		int sq=num*num;
		for(i=num;i>0;i=i/10)
		{
		    flag++;
		}
		exp=pow(10,flag);
		ld=sq%exp;
		if(ld==num)
		{
		    System.out.println(num+" is an automorph");
		}
		else
		{
		    System.out.println(num+" is not an automorph");
		}
	}
	
	public static int pow(int n,int p)
	{ int power=1,i;
	    for(i=0;p!=0;i++)
	    {
	        power=power*n;
	        p--;
	    }
	    return power;
	}
}
