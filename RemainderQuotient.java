// RemainderQuotient class to find the quotient and remainder of two numbers
import java.util.Scanner;

class RemainderQuotient {
    
    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // result[0] for remainder, result[1] for quotient
        
        // Calculate quotient
        result[1] = number / divisor;
        
        // Calculate remainder
        result[0] = number % divisor;
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Variables to take input
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scan.nextInt();
        
        // Variable to find remainder and quotient
        RemainderQuotient remainderQuotient = new RemainderQuotient();
        int[] result = remainderQuotient.findRemainderAndQuotient(number, divisor);
        
        // Print the result
        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
        
        scan.close(); // close the scanner object
    }
}