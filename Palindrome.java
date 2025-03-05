// class Palindrome to perform number-based checks like palindrome, reversing, and duck numbers.
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    // Method to count digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int num) {
        int length = countDigits(num);
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to check if two arrays are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        return arraysEqual(digits, reverseArray(digits));
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int num) {
        String strNum = String.valueOf(num);
        return strNum.contains("0") && strNum.charAt(0) != '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Digits count: " + countDigits(num));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseArray(storeDigits(num))));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));

        scanner.close();
    }
}
