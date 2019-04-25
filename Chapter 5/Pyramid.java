//Author: Kalee Riddle Date: 4/23/19 This program will build a pyramid of all numbers in numerical order between 1 and 15. 

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter the number of lines
		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();
		
		while (numberOfLines < 1 || numberOfLines > 15){
			System.out.println("You must enter a number from 1 to 15: ");
			System.out.print("Enter the number of lines: ");
			numberOfLines = input.nextInt();
		}
		//Print Pyramid
		for (int row = 1; row <= numberOfLines; row++){
			//Print number of lines
			for (int column = 1; column <= numberOfLines - row; column++)
			System.out.print("   ");
			
			//Print number of rows
			for (int num = row; num >= 1; num--)
			System.out.printf("%3d" , num);
			
			//Print the end of line numbers
			for (int num = 2; num <= row; num++)
			System.out.printf("%3d" , num);
			
			//Start new line
			System.out.println();
		}
	}
}