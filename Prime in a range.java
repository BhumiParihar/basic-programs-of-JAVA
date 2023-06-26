//program to find prime numbers in the given range

import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) 
	{
	    int i,j,flag=0;
	    Scanner input=new Scanner(System.in);
		System.out.println("Enter the lower limit: ");
		int n1=input.nextInt();
		System.out.println("Enter the upper limit: ");
		int n2=input.nextInt();
		for(i=n1;i<=n2;i++)
		{
		    flag=0;
		    for(j=2;j<=i-1;j++)
		    {
		        if(i%j==0)
		        {
		            flag=1;
		        }
		    }
		   if (flag==0)
    		{
    		    System.out.print(i+",");
    		} 
		}
		
	}
	
}
