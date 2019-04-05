//Author: Kalee Riddle Date: 4/3/19 This program will show a point within the rectangle and show the input as invalid if it reaches outside of the perimeter.

import java.util.Scanner;

class EnterApoint {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter x and y
		System.out.println("Enter a value for x ");
		double x = input.nextDouble();
		System.out.println("Enter a value for y ");
		double y = input.nextDouble();
		
		//Reading the result
		if (( x >= 5) || (x <= -5)){
	}
		else if (( y >= 2.5) || (y <= -2.5)) {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
			}	
		else { System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		}
	}
}