import java.util.Scanner;

public class SumOfNaturalNumbersCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Formula method
            int formulaSum = n * (n + 1) / 2;

            // While loop method
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Print both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("✅ Both computations are correct!");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}
