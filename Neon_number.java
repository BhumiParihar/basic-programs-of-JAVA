//program to check whether a number is neon number or not.
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int square = num * num; 
        int digitSum = 0; 
        while (square > 0) 
        {
            digitSum += square % 10;
            square /= 10;
        }
        if (digitSum == num) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }
    }
}
