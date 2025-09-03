import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Side = Perimeter / 4
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}
