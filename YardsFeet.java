// YardsFeet class with methods for various conversions
import java.util.Scanner;

public class YardsFeet {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to take input and display respective values
        System.out.print("Enter value in yards: ");
        double yards = scan.nextDouble();
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter value in feet: ");
        double feet = scan.nextDouble();
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter value in meters: ");
        double meters = scan.nextDouble();
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter value in inches: ");
        double inches = scan.nextDouble();
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches is " + convertInchesToCm(inches) + " centimeters");

        scan.close(); // close the scanner
    }
}
