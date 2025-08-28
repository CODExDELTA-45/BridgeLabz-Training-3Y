import java.util.Scanner;

public class ShoppingCartSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char moreCustomers;

        while (true) {  
            int total = 0;
            int addMore;

            do { 
                System.out.println("\nMenu:");
                System.out.println("1. Laptop (40000)");
                System.out.println("2. Mobile (15000)");
                System.out.println("3. Headphones (2000)");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                int price = 0;
                switch (ch) {
                    case 1: price = 40000; break;
                    case 2: price = 15000; break;
                    case 3: price = 2000; break;
                    default: System.out.println("Invalid!"); 
                }

                if (price > 0) {
                    System.out.print("Quantity: ");
                    int q = sc.nextInt();
                    total += price * q;
                }

                System.out.print("Add more? (1-Yes / 0-No): ");
                addMore = sc.nextInt();
            } while (addMore == 1);

            if (total > 5000) total -= total * 0.1; 

            System.out.println("Final Bill = " + total);

            System.out.print("\nNext customer? (Y/N): ");
            moreCustomers = sc.next().charAt(0);
            if (moreCustomers == 'N' || moreCustomers == 'n') break;
        }
        sc.close();
    }
}
