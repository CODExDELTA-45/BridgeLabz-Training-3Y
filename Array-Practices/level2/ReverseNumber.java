import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int count = 0;
        long temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
