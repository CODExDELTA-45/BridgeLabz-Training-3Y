import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Integer operations (respecting operator precedence)
        int result1 = a + b * c;    // Multiplication before addition
        int result2 = a * b + c;    // Multiplication before addition
        int result3 = c + a / b;    // Division before addition
        int result4 = a % b + c;    // Modulus before addition

        // Output
        System.out.println("The results of Int Operations are " +
                           result1 + ", " + result2 + ", " +
                           result3 + ", and " + result4);

        input.close();
    }
}
