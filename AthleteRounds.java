// class Athelete Rounds to calculate how many rounds of triangle to complete distance
import java.util.Scanner;

public class AthleteRounds {

    // Calculate total number of rounds to around the triangle
    public int totalRounds(double side1, double side2, double side3, double totalDistance){
        
        double perimeter = side1 + side2 + side3;   // Compute perimeter
        return (int) Math.ceil(totalDistance / perimeter);

    }

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the three sides of the triangular park
        System.out.print("Enter the length of side a (in meters): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b (in meters): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c (in meters): ");
        double c = scanner.nextDouble();

        // Find rounds needed to complete 5 kms
        AthleteRounds athleteRounds = new AthleteRounds();
        int roundsNeeded = athleteRounds.totalRounds(a, b, c, 5000); // 5000 m = 5 km

        // Print the result
        System.out.println("The athlete needs to complete " + roundsNeeded + " rounds to complete 5 km.");

        scanner.close(); // close scanner
    }
}
