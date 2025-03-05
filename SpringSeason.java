// SpringSeason class to check if a given date is within the Spring season (March 20 to June 20)
import java.util.Scanner;

class SpringSeason {
    
    // Check if the date is within the spring season
    public boolean checkSpring(int month, int day){
        if ((month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter the month and day
        System.out.print("Enter month: ");
        int month = scan.nextInt();
        
        System.out.print("Enter day: ");
        int day = scan.nextInt();
        
        // Print if its spring or not
        SpringSeason springSeason = new SpringSeason();
        if (springSeason.checkSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }        
        
        scan.close(); // Close the scanner object
    }
}