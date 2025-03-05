// class SimpleInterest to calculate simple interest
import java.util.Scanner;

class SimpleInterest{
    
    // Calculate Simple Interest
    public double calculateSI(double principal, double rate, double time){
		return (principal * rate * time) / 100;
    }

	public static void main(String[] args){
		// Declare Scanner object
		Scanner scan = new Scanner(System.in);

		// Take input for principal, rate and time
		System.out.print("Enter Principal : ");
		double principal = scan.nextDouble();
		
		System.out.print("Enter Rate : ");
		double rate = scan.nextDouble();

		System.out.print("Enter Time : ");
		double time = scan.nextDouble();
		
        // Get the simple interest
		SimpleInterest simpleInterest = new SimpleInterest();
        double result = simpleInterest.calculateSI(principal, rate, time);

		// Print Simple Interest
		System.out.print("The Simple Interest is " + result + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		// Close scanner
		scan.close();

	}
}