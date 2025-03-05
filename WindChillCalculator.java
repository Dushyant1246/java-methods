// WindChillCalculator class to compute wind chill temperature
import java.util.Scanner;

class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Variables to take input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scan.nextDouble();
        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scan.nextDouble();
        
        // Variable to calculate wind chill
        WindChillCalculator windChillCalculator = new WindChillCalculator();
        double windChill = windChillCalculator.calculateWindChill(temperature, windSpeed);
        
        // Print the result
        System.out.println("Wind Chill Temperature: " + windChill);
        
        scan.close(); // close the scanner object
    }
}