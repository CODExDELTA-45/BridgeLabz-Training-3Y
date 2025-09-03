import java.util.Scanner;

public class BMIPersons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            height[i] = sc.nextDouble();

            double heightM = height[i]/100.0;
            bmi[i] = weight[i]/(heightM*heightM);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + height[i] + "\t" + weight[i] + "\t" + String.format("%.2f", bmi[i]) + "\t" + status[i]);
        }
        sc.close();
    }
}
