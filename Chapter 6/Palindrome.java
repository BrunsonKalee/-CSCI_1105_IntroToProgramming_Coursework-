// Author: Kalee Riddle Date: 4/29/19 The program will prompt the user to enter and integer and reports whether the integer is a palindrome.

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt User
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		
		//Is the integer a palindrome?
		System.out.println(integer + (isPalindrome(integer) ? " is " : " is not ") + "a palindrome.");
	}
	
	//isPalindrome
	public static boolean isPalindrome(int integer) {
		return integer == reverse(integer) ? true : false;
	}
	
	//Reverse integer
	public static int reverse(int integer) {
		//holds number
		String reverse = ""; 
		//converts number
		String i = integer + "";
		
		//Reverse string
		for (int n = i.length() - 1; n >= 0; n--) {
			reverse += i.charAt(n);
		}
		//return inverse
		return Integer.parseInt(reverse);
	}
}