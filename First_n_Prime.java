//Program to print first n prime numbers.
import java.util.Scanner;
public class First_n_Prime
{
	public static void main(String[] args) 
	{
	    int i=1,j,flag=0,num;
	    Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of prime numbers needed: ");
		int n=input.nextInt();
		num=1;
		while(num<=n)
		{
		    flag=0;
		    for (j=2;j<=i-1;j++)
		    {
		        if (i%j==0)
		        {
		            flag=1;
		        }
		    }
		    if (flag==0)
		    {
		        System.out.print(i+"  ");
		        num++;
		    }
		    i++;
		}
	}
}
