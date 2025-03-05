// FahrenheitCelsius class with methods for temperature, mass, and volume conversions
import java.util.Scanner;

public class FahrenheitCelsius {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to take input and display respective values
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scan.nextDouble();
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");

        System.out.print("Enter weight in pounds: ");
        double pounds = scan.nextDouble();
        System.out.println(pounds + " pounds is " + convertPoundsToKg(pounds) + " kilograms");

        System.out.print("Enter weight in kilograms: ");
        double kg = scan.nextDouble();
        System.out.println(kg + " kilograms is " + convertKgToPounds(kg) + " pounds");

        System.out.print("Enter volume in gallons: ");
        double gallons = scan.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter volume in liters: ");
        double liters = scan.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons");

        scan.close(); // close the scanner
    }
}
