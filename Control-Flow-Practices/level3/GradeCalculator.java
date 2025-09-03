import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: Level 4 - Above agency-normalized standards");
        } else if (average >= 80) {
            System.out.println("Grade: Level 3 - At agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade: Level 2 - Below agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade: Level 1 - Far below agency-normalized standards");
        } else {
            System.out.println("Grade: Level 0 - Too below agency-normalized standards");
        }
    }
}
