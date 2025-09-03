import java.util.Scanner;

public class BMIPersons2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // 0: weight, 1: height, 2: BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (cm) for person " + (i+1) + ": ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            double heightM = personData[i][1]/100.0;
            personData[i][2] = personData[i][0]/(heightM*heightM);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + personData[i][0] + "\t" + personData[i][1] + "\t" + String.format("%.2f", personData[i][2]) + "\t" + status[i]);
        }
        sc.close();
    }
}
