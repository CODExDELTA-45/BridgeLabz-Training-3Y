public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;  // Calculate discount amount
        double discountedPrice = fee - discount;          // Calculate final price

        System.out.println("The Discount Amount is INR " + discount);
        System.out.println("The Fee after Discount is INR " + discountedPrice);
    }
}
