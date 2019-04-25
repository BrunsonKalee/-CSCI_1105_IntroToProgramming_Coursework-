//Author: Kalee Riddle Date: 4/23/19 This program will give me the number of each vowel and consonant in the alphabet. 

import java.util.Scanner;

public class VowelorConsonants {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);		
		//Starting the string
		System.out.print("Enter a string: ");
		String a = input.nextLine();
		int numberOfVowel = 0;
		int numberOfCons = 0;
		//For loop
		for (int letters = 0; letters < a.length(); letters++) {
			if(Character.isLetter(a.charAt(letters))){
				if (Character.toUpperCase(a.charAt(letters)) == 'A' ||
					Character.toUpperCase(a.charAt(letters)) == 'E' ||
					Character.toUpperCase(a.charAt(letters)) == 'I' ||
					Character.toUpperCase(a.charAt(letters)) == 'O' ||
					Character.toUpperCase(a.charAt(letters)) == 'U') {
						numberOfVowel++;
				}
				else {
					numberOfCons++;
				}
			}	
		}
		//Solution
		System.out.println("The number of vowels is: " +numberOfVowel);
		System.out.println("The number of consonants is: " +numberOfCons);
	}
}