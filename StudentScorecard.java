// class StudentScorecard to find grade of student
import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    // Method to generate random scores for PCM subjects
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // [Physics, Chemistry, Math]

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100); // Physics
            scores[i][1] = random.nextInt(100); // Chemistry
            scores[i][2] = random.nextInt(100); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] computeResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [Total, Average, Percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg);
            results[i][2] = Math.round(percentage);
        }
        return results;
    }

    // Method to display scorecard without printf
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Physics  Chemistry  Math  Total  Average  Percentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + " " + scores[i][1] + " " + scores[i][2] + " " + results[i][0] + " " + results[i][1] + " " + results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = computeResults(scores);
        displayScorecard(scores, results);

        scanner.close();
    }
}
