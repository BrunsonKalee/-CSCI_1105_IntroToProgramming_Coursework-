//Author: Kalee Riddle Date: 4/2/19 This code will configure the cost of driving by calculating distance, miles, and price per gallon.
import java.util.Scanner;
class CostofDriving {
	public static void main(String[] args) {
	//Create Scanner
	Scanner input = new Scanner(System.in);
	//enter the distance in miles
	System.out.println("Enter the driving distace: ");
	double drivingDistance = input.nextDouble();
	//Enter the miles per gallon
	System.out.println("Enter the miles per gallon: ");
	double milesPerGallon = input.nextDouble();
	//Enter price per gallon
	System.out.println("Enter the price per gallon: ");
	double pricePerGallon = input.nextDouble();
	//Answer is presented
	System.out.println("The cost of driving is " + drivingDistance / milesPerGallon * pricePerGallon );	
	}
}