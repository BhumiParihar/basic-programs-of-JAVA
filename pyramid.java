// program to print pyramid ,where the number of rows are entered by user.
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}