//Author: Kalee Riddle Date: 5/6/19 This program will find the smallest element in an array.

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Array
		double[] numbers = new double[10];
		
		//Prompt User
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		//Display value
		System.out.println("The minimum number is: " + min(numbers));
	}
	//Method
	public static double min(double[] array){
		double min = array[0];
		for (double i: array){
			if (i < min)
					min = i;
		}
		return min;
	}

}