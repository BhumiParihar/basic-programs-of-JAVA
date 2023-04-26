import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the area of the square: ");
        double area = input.nextDouble();

        double sideLength = Math.sqrt(area); // calculate the side length using the area
        double perimeter = 4 * sideLength; // calculate the perimeter using the side length

        System.out.println("The perimeter of the square is: " + perimeter);
    }
}
