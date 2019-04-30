// Author: Kalee Riddle Date: 4/29/19 The program will print out an n-by-n matrix table using 0s and 1s.

import java.util.Scanner;

public class NbyN {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter 'n'
		System.out.print("Enter n: ");
		int n = input.nextInt();
		//Display n by n box
		printMatrix(n);
	}
	//Print n by n box
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows ++) {
			for (int cols = 0; cols < n; cols ++){
				//Print randomly 0 or 1
				System.out.print(" " + (int)(Math.random() * 2));		
			}
			System.out.println();
			
	}	
		//Print
		System.out.println();
		
	}
}