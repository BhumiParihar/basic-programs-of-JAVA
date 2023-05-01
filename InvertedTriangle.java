// program to print right angled triangle upto n number of rows.
import java.util.*;
public class InvertedTriangle
{
    public static void main(String[] args)
    {
        int rows;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        rows=sc.nextInt();
        for (int i = rows; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}