import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Enter Maths marks for student " + (i+1) + ": ");
            marks[i][2] = sc.nextDouble();

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 90) grade[i] = "A+";
            else if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B+";
            else if (percentage[i] >= 60) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + String.format("%.2f", percentage[i]) + "\t" + grade[i]);
        }

        sc.close();
    }
}
