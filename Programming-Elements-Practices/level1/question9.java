import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating discount and final price
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
