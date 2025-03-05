// KilometersMiles class for various conversions to miles, kilometers, feet
import java.util.Scanner;

public class KilometersMiles {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Main method to test conversions
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to take input and display respective values
        System.out.print("Enter value in kms: ");
        double kms = scan.nextDouble();
        System.out.println(kms + " km to miles: " + convertKmToMiles(kms));
        
        System.out.print("Enter value in miles: ");
        double miles = scan.nextDouble();
        System.out.println(miles + " miles to km: " + convertMilesToKm(miles));
        
        System.out.print("Enter value in meters: ");
        double meters = scan.nextDouble();
        System.out.println(meters + " meters to feet: " + convertMetersToFeet(meters));
        
        System.out.print("Enter value in feet: ");
        double feet = scan.nextDouble();
        System.out.println(feet + " feet to meters: " + convertFeetToMeters(feet));
    }
}
