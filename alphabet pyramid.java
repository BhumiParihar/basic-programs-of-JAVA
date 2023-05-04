//program to print pyramid pattern using alphabets.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows needed ");
		int rows = sc.nextInt();
		for (int i = 0; i <= rows; i++)
		{
			int alphabet = 65;
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++)
			{
				System.out.print((char) (alphabet + i) + " ");
			}
			System.out.println();
		}
	}
}