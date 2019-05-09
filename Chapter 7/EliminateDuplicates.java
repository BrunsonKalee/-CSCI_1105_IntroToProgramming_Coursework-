//Author: Kalee Riddle Date: 5/8/19 This program will eliminate duplicate numbers in the code.

import java.util.Scanner;

public class EliminateDuplicates {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		//Prompt User
		System.out.print("Please enter ten numbers: ");
		//Reading numbers into the array
		for (int i = 0; i < numbers.length; i++) {
		numbers[i] = input.nextInt();
	}
	int[] result = eliminateDuplicates(numbers);
	//Display number of distinct 
	System.out.println("The number of duplicate numbers is: " + result.length);
	System.out.print("Array duplicates are: ");
	for (int i = 0; i < result.length; i++) {
		System.out.print(result[i] + " ");
	}
}
	public static int[] eliminateDuplicates(int[] numbers) {
		int[] temp = new int[numbers.length];
		int duplicateNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			boolean isInArray = false;
				for (int j = 0; j < i && !isInArray; j++)
					if (numbers[j] == numbers[i]) {
						isInArray = true;
					}
				if (isInArray) {
					temp[duplicateNumber] = numbers[i];
					duplicateNumber++;
				}
		}
		int[] result = new int[duplicateNumber];
		for (int i = 0; i < duplicateNumber; i++)
			result[i] = temp[i];
			return result;
	}
}