import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking base and height in cm
        System.out.print("Enter base of the triangle (in cm): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double heightCm = input.nextDouble();

        // Area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert cm² to in² (1 inch = 2.54 cm → 1 sq inch = 6.4516 sq cm)
        double areaIn2 = areaCm2 / 6.4516;

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaIn2 +
                           " and sq cm is " + areaCm2);

        input.close();
    }
}
