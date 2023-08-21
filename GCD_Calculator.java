//program to find GCD of two numbers
import java.util.Scanner;
public class GCDCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("enter the second number: ");
        int number2 = input.nextInt();
        int gcd = calculateGCD(number1, number2);
        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
    public static int calculateGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}

