// Author: Kalee Riddle Date: 4/29/19 The program will prompt the user to format an integer with a specified width.

import java.util.Scanner;

public class SpecifiedWidth {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt User
		System.out.print("Enter a number with the specified width: ");
		int number = input.nextInt(); /**space**/ int width = input.nextInt();
		
		//Display 
		System.out.println(number + " formatted to width " + width + ": " + format(number, width));
	}
	//Method
	public static String format(int number, int width) {
		//string
		String num = number + "";
		
		//If statement
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--){
				num = 0 + num;
			}
		}
		return num;
	}
}