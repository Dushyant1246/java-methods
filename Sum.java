// Sum class to find the sum of n natural numbers
import java.util.Scanner;

class Sum {
    // Using for loop to calculate sum
    public int naturalSum(int number){
        int loopSum = 0;
        for (int i = 1; i <= number; i++) {
            loopSum += i; // Add the current number to loopSum
        }
        return loopSum;
    }

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Check if it's a natural number
        if (number > 0) {
            // Find sum of natural numbers
            Sum sum = new Sum();
            int result = sum.naturalSum(number);

            // Print result
            System.out.println("Natural Sum: " + result);
        } else {
            System.out.println("The number is not a natural number.");
        }
        
        scan.close(); // Close the scanner object
    }
}