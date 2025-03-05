// Handshakes class to find the maximum number of handshakes among N number of students
import java.util.Scanner;
class Handshakes {

    // Calculate number of handshakes for number of students
    public int combinationHandshakes(int numberOfStudents){
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scan.nextInt();
        
        // Variable to calculate maximum number of handshakes
        Handshakes handshakes = new Handshakes();
        int result = handshakes.combinationHandshakes(numberOfStudents);
        
        // Print the result
        System.out.println("The maximum number of handshakes is " + result);
        
        scan.close(); // Close the scanner
    }
}