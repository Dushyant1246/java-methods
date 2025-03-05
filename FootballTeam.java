// class FootballTeam to find the shortest, tallest, and mean height of players in a football team.
import java.util.Scanner;

public class FootballTeam {
    // Method to calculate the sum of all heights in the array
    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating an array to store heights of players
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        int[] heights = new int[n];

        // Taking user input for heights
        System.out.println("Enter the heights of " + n + " players in cm:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // Displaying results
        System.out.println("Mean Height: " + meanHeight(heights) + " cm");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");

        // Closing scanner
        scanner.close();
    }
}
