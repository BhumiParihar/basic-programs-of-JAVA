// program to print hollow rectangle ,where the number of rows and columns are entered by user.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no of rows");
	    int a=sc.nextInt();
	    System.out.println("enter the no of columns");
	    int b=sc.nextInt();
	    for(int i=0;i<a;i++)
	    {
	        for(int j = 0 ; j < b; j++ )
	        {
	            if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
	        }
	        System.out.println();
	    }
	}
}
	            
