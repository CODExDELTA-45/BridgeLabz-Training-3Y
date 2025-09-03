import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // 1 yard = 3 feet
        double yards = feet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        // Output
        System.out.println("The distance is " + yards + " yards and " + miles + " miles for the given " + feet + " feet.");

        input.close();
    }
}
