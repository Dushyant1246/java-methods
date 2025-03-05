// NumberCheck class to check numbers and compare first and last elements
import java.util.Scanner;

public class NumberCheck {
    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num > 0;
    }

    // Method to check if a number is negative
    public static boolean isNegative(int num) {
        return num < 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        // Prompt use to take input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        // Checking each number for positive/negative and even/odd
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (isNegative(num)) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("It is Zero");
            } 
        }

        // Comparing first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First number is greater than last number");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal");
        } else {
            System.out.println("First number is less than last number");
        }

        scan.close(); // Closing scanner
    }
}
