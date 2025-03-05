// RandomNumber class to generate a random 4-digit number array and analyze min, max, and average
import java.util.Random;

public class RandomNumber {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000; // Generates a random number between 1000 and 9999
        }

        return numbers;
    }

    // Method to find the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return as an array
    }

    public static void main(String[] args) {
        // Define the array size
        int size = 5; // Generate 5 random numbers

        // Generate the random array
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find average, min, and max
        double[] result = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Generated 4-digit Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
