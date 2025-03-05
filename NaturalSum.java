// class NaturalSum to find sum of n natural numbers using recursion and formula
import java.util.Scanner;

public class NaturalSum {
    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);

        // Prompt user to take input
        System.out.print("Enter a natural number: ");
        int n = scan.nextInt();

        // Print if not a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0)");
            return;
        }

        // Variables to store result
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        // Print the result
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);

        scan.close(); // close the scanner
    }
}
