//Author: Kalee Riddle Date: 5/13/18 This program will read the state for each capital entered in.

import java.util.Scanner;

public class Capitals {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int correctCount = 0;
	//Prompt User
	String[][] stateCapitals = {
	{"colorado", "denver"},
	{"california", "sacramento"},
	{"utah", "salt lake city"},
	{"nevada", "carson city"},
	{"georgia", "atlanta"},
	{"delaware", "dover"},
	{"texas", "austin"},
	{"tennessee", "nashville"},
	{"idaho", "boise"},
	{"hawaii", "honolulu"}
	};
	for (int i = 0; i < stateCapitals.length; i++){
		System.out.println("What is the capital of " + stateCapitals[i][0] + "?");
		String state = input.nextLine();
		if(state.toLowerCase().equals(stateCapitals[i][1])){
			System.out.println("The answer is correct."); 
			correctCount++;
		}
		else{
			System.out.println("The answer is incorrect!");
			
		
		}
	}
	System.out.print("The correct count is " + correctCount + ". ");
	}
}