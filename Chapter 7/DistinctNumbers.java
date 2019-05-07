//Author: Kalee Riddle Date: 5/6/19 This program will read ten numbers and print out their distinct numbers with exactly one space between each.

import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Enter length of 10
		int[] distinctNumbers = new int[10];
		int num;
		int count = 0;
		//Prompt User
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			
			//Test distinct
			if (isDistinct(distinctNumbers, num)){
				distinctNumbers[count] = num;
				count++;
			}
		}
		//Display the numbers
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++){
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}
	//Method
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++){
			if (num == array[i])
					return false;
		}
		return true;
	}
}