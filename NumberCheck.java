// NumberCheck class to check whether a number is positive, negative, or zero
import java.util.Scanner;

class NumberCheck {

    // Check if number is positive negative or zero
    public int checkNumber(int number){
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Result variable for if the number is positive, negative, or zero
        NumberCheck numberCheck = new NumberCheck();
        int result = numberCheck.checkNumber(number);

        // Print the result
        if (result == 1) {
            System.out.println("Positive");
        } else if (result == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        scan.close(); // Close the scanner object
    }
}