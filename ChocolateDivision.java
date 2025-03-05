// ChocolateDivision class to divide chocolates among children
import java.util.Scanner;

class ChocolateDivision {

    // Method to find chocolates each child gets and the remainder
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2]; // result[0] for remaining chocolates, result[1] for chocolates per child
        
        // Calculate chocolates each child gets
        result[1] = numberOfChocolates / numberOfChildren;
        
        // Calculate remaining chocolates
        result[0] = numberOfChocolates % numberOfChildren;
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Variables to take input
        System.out.print("Enter the total number of chocolates: ");
        int chocolates = scan.nextInt();
        System.out.print("Enter the number of children: ");
        int children = scan.nextInt();
        
        // Variable to find chocolates per child and remainder
        ChocolateDivision chocolateDivision = new ChocolateDivision();
        int[] result = chocolateDivision.findRemainderAndQuotient(chocolates, children);
        
        // Print the result
        System.out.println("Each child gets: " + result[1] + " chocolates");
        System.out.println("Remaining chocolates: " + result[0]);
        
        scan.close(); // close the scanner object
    }
}