//write a program to input 3 unique integers and print the greatest among them
import java.util.Scanner;
public class Greatest
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=input.nextInt();
		System.out.print("\nEnter the second number: ");
		int num2=input.nextInt();
		System.out.print("\nEnter the third number: ");
		int num3=input.nextInt();
		if(num1==num2&&num2==num3)
		System.out.println("All three numbers are equal");
		else if(num1>num2&&num1>num3)
		System.out.println(num1+" is greatest");
		else if(num2>num1&&num2>num3)
		System.out.println(num2+" is greatest");
		else 
		System.out.println(num3+" is greatest");
	}
}
