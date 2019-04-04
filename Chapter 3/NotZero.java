//Author: Kalee Riddle Date: 4/3/19 This program will show the answer if it is not 0.

import java.util.Scanner;

class NotZero {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		//Enter a number for each letter displayed 
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		System.out.println("Enter d: ");
		double d = input.nextDouble();
		System.out.println("Enter e: ");
		double e = input.nextDouble();
		System.out.println("Enter f: ");
		double f = input.nextDouble();		
		
		if ((a * d) - (b * c) == 0){
			System.out.println("Cannot divide by zero");
		}
		else{
			double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
			double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
			System.out.println("x = " + x);
			System.out.println("y = " + y);		}
		
		
	}
}