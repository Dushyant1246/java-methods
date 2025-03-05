//LargestThree class to check which number is the largest and smallest among the 3
import java.util.Scanner;

class SmallestLargest{

    // Find the largest and the smallest number
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] result = new int[2];  // result[0] for smallest result[1] for largest
        
        // Assume number1 is both the smallest and largest initially
        int smallest = number1;
        int largest = number1;

        // Compare with number2
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with number3
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Store results
        result[0] = smallest;
        result[1] = largest;
        return result;
    }

	public static void main(String[] args){
		//Scanner object to take input
		Scanner scan = new Scanner(System.in);
		
		//Variables to take 3 inputs
		System.out.print("Enter First number: ");
		int number1 = scan.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = scan.nextInt();
		System.out.print("Enter Third number: ");
		int number3 = scan.nextInt();
		
		// Variable to find smallest and largest
        SmallestLargest smallestLargest = new SmallestLargest();
		int[] result = smallestLargest.findSmallestAndLargest(number1, number2, number3);
		
		// Print the result
		System.out.println("Largest " + result[1]);
		System.out.println("Smallest " + result[0]);
		
		scan.close(); // close the scanner object
	}
}