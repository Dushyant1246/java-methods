// StudentVote class to check if students are eligible to vote based on their age
import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);

        // Taking input from user for 10 students
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scan.nextInt();
        }

        // Checking voting eligibility for each student
        System.out.println("Voting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") - " + (canVote ? "Eligible to vote" : "Not eligible to vote"));
        }

        scan.close();  // close the scanner
    }
}
