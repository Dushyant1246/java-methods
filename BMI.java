// BMI class to calculate BMI for 10 people and determine their BMI status
import java.util.Scanner;

public class BMI {
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    // Method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9) return "Normal";
        else if (bmi >= 25 && bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        double[][] peopleData = new double[10][3]; // 10 rows (people), 3 columns (weight, height, BMI)
        String[] bmiStatus = new String[10];

        // Taking input from user
        System.out.println("Enter weight (kg) and height (cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            peopleData[i][0] = scan.nextDouble(); // Storing weight

            System.out.print("Person " + (i + 1) + " Height (cm): ");
            peopleData[i][1] = scan.nextDouble(); // Storing height

            peopleData[i][2] = calculateBMI(peopleData[i][0], peopleData[i][1]); // Storing BMI
            bmiStatus[i] = determineBMIStatus(peopleData[i][2]); // Storing BMI Status
        }

        // Displaying results
        System.out.println("\nBMI Report:");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + peopleData[i][0] + "\t\t" + peopleData[i][1] + "\t\t" + peopleData[i][2] + "\t" + bmiStatus[i]);
        }

        scan.close(); // Closing scanner
    }
}
