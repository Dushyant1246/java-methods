// FriendsComparison class to find the youngest and tallest among three friends
import java.util.Scanner;

public class FriendsComparison {
    // Method to find the youngest among three friends
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find the tallest among three friends
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Prompt use to take input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scan.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = scan.nextDouble();
        }

        // Displaying results
        System.out.println("Youngest friend: " + findYoungest(names, ages));
        System.out.println("Tallest friend: " + findTallest(names, heights));

        scan.close(); // Closing scanner
    }
}
