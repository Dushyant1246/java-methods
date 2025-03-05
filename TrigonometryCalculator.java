// TrigonometryCalculator class to compute sine, cosine, and tangent
import java.util.Scanner;

class TrigonometryCalculator {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3]; // result[0] for sine, result[1] for cosine, result[2] for tangent
        
        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate trigonometric values
        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Variable to take input
        System.out.print("Enter the angle in degrees: ");
        double angle = scan.nextDouble();
        
        // Variable to calculate trigonometric functions
        TrigonometryCalculator trigonometryCalculator = new TrigonometryCalculator();
        double[] result = trigonometryCalculator.calculateTrigonometricFunctions(angle);
        
        // Print the result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
        
        scan.close(); // close the scanner object
    }
}