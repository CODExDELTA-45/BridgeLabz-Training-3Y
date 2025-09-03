import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown
        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement counter
        }

        System.out.println("Liftoff 🚀");

        sc.close();
    }
}
