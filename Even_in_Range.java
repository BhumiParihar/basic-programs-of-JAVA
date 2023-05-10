//Program to display all the even numbers in the given range.

import java.util.Scanner;

public class Even_in_Range
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int n1= input.nextInt();
        System.out.print("Enter the upper limit: ");
        int n2= input.nextInt();
        
        for(int i=n1;i<=n2;i++)
        {
            if (i%2==0)
            {
                System.out.print(i+"  ");
            }
        }
        
    }
}
