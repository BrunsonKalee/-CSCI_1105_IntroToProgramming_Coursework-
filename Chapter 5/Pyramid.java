//Author: Kalee Riddle Date: 4/23/19 This program will build a pyramid of all numbers in numerical order between 1 and 15. 

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt User to enter pyramid size as large as 15 tall
		System.out.println("Enter the number of lines needed in the pyramid: ");
		int numberOfLines = input.nextInt();
		
		//Pyramid
		for (int rows = 1; rows <= numberOfLines; rows++) {
			for (int s = numberOfLines - rows; s >= 1; s--) {
				System.out.print(" ");
			}
			for (int l = rows; l >= 2; l--) {
				System.out.print(l + " ");
			}
			for (int r = 1; r <= rows; r++){
				System.out.print(r + " ");
			}
			System.out.println();
		}
		
	 }
}