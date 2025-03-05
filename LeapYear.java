// class LeapYear to check if a given year is a Leap Year
import java.util.Scanner;

public class LeapYear {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false; // Gregorian calendar starts from 1582
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Scanner object to take input
        Scanner scan = new Scanner(System.in);

        // Prompt user to take input
        System.out.print("Enter a year: ");
        int year = scan.nextInt();

        // Print result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        scan.close(); // close the Scanner
    }
}
