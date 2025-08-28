public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        
        int[] scores = {45, 102, 76, 89, 34, 150, 99};
        
        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;
        boolean hasCentury = false;

        for (int score : scores) {
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
            sum += score;
            if (score >= 100) hasCentury = true;
        }

        double average = (double) sum / scores.length;

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
        if (hasCentury) {
            System.out.println("Century Scorer");
        }
    }
}
