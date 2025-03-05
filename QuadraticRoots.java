// QuadraticRoots to find the roots of a quadratic equation using Math functions
import java.util.Scanner;

public class QuadraticRoots {
    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate discriminant
        double[] roots;

        if (delta > 0) {
            // Two real roots
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            // One real root
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            // No real roots (return empty array)
            roots = new double[0];
        }
        return roots;
    }

    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner scan = new Scanner(System.in);

        // Taking input for quadratic equation coefficients
        System.out.print("Enter coefficient a: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scan.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scan.nextDouble();

        // Finding roots
        double[] roots = findRoots(a, b, c);

        // Displaying results
        if (roots.length == 2) {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scan.close(); // Closing scanner
    }
}
