//Author: Kalee Riddle Date: 4/3/19 This program will show the perimeter of the triangle.

import java.util.Scanner;

class TrianglePer {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		//Enter perimeter digits
		System.out.println("Please enter 3 digits for sides a, b and c ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		//If and if else statements
		if ( a + b == c){
			System.out.println("The input is invalid.");
		}
		else if (b + c == a){
			System.out.println("The input is invalid.");		
			}
		else if (c + a == b){
			System.out.println("The input is invalid.");	}
		else{ System.out.println("The perimeter is: " + (a + b + c));		
		}
	}
}