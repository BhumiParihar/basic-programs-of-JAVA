
import java.util.Scanner;

public class Oblong
{
	public static void main(String[] args) 
	{ int i,flag=0,pro=0;
	    System.out.println("Enter the number: ");
	    Scanner input=new Scanner(System.in);
	    int num=input.nextInt();
	    for(i=1;i<=((num-1)/2);i++)
	    {
	        pro=0;
	        pro=i*(i+1);
	        if (num==pro)
	        {
    	        flag++;
    	        break;
	        }
	    }
	    if (flag==1)
	    {
	        System.out.println(num+" is an oblong number");
	    }
	    else
	    {
	         System.out.println(num+" is not an oblong number");
	    }
	    
	}
}
