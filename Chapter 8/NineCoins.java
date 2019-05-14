//Author: Kalee Riddle Date: 5/13/18 This program will place nine coins in a 3 by 3 matrix with some face up and some face down.

import java.util.Scanner;

public class NineCoins {
	public static void main(String[] args) {
//  Integer.toBinaryString();
	//Scanner
	Scanner input = new Scanner(System.in);
	//Matrix
	int[][] m = new int[3][3];
	//Enter Array Values
	System.out.println("Enter a number between 0 and 511: ");
	int c = input.nextInt();
	String h = Integer.toBinaryString(c);
	int l = 9;	
	if (h.length() < l){
		for (int i = l - h.length(); i > 0; i--){
		h = 0 + h;
		}
	}
	int count = 0;
	//T1 and H0
	for (int i = 0; i < h.length(); i++){
		if (h.charAt(i) == '0'){
			System.out.print("H ");
		} 
		else{
			System.out.print("T ");
		} 
		count++;
		if (count == 3){
			System.out.println();
			count = 0;
		}
	}
	}
}