//Author: Kalee Riddle Date: 5/20/19 This program is going to run like a game of '21'. There will be a place to deal the cards and a place to add up the cards after each round.  

import java.util.Scanner;
import javax.swing.*;

public class BlackJack {
	public static void main(String[] args) {
	//Scanner
	Scanner input = new Scanner(System.in);
	//Introducing Cards
	int[] deck = new int[52];
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	int playerwins = 0;
	int dealerwins = 0;
	//52 cards
	for (int i = 0; i < deck.length; i++)
		deck[i] = i;
	//Values of cards
	String[][] numbervalue = {
		//{"A", "1"},
		{"2", "2"},
		{"3", "3"},
		{"4", "4"},
		{"5", "5"},
		{"6", "6"},
		{"7", "7"},
		{"8", "8"},
		{"9", "9"},
		{"10", "10"},
		{"A", "11"},
		{"Jack", "10"},
		{"Queen", "10"},
		{"King", "10"}
	};
	String playagain = "y";
	while (playagain.toLowerCase().equals("y")){
		int playertotal = 0;
		int dealertotal = 0;
		playertotal = player(deck, numbervalue);
		dealertotal = dealer(deck, numbervalue);
		if(dealertotal == 21 || dealertotal > playertotal){
			System.out.println("Dealer wins!");
			dealerwins++;
		}
		else if(playertotal == 21 || playertotal > dealertotal){
			System.out.println("Player wins!");
			playerwins++;
		}
		else{
			System.out.println("Push.");
		}	
		System.out.println("Player wins = " +playerwins);
		System.out.println("Dealer wins = " +dealerwins);
		System.out.println("Do you want to play again? ('y' or 'n')");
		playagain = input.next(); 
	}

	System.out.println("GAME OVER");
	//dealer(deck, numbervalue);
	//player(deck, numbervalue);
	/** Show dealers 2 random cards and display them against the players hand. Decide who has higher cards and display the winner */
	
	/** Make it between 17 and 21 to print out 21. Over 21 bust*/
	//21 Blackjack. Less than 17/Over 21 Bust
	
	}//end main method
	public static int player(int[] deck, String[][] numbervalue){
		Scanner input = new Scanner(System.in);
		System.out.println("PLAYER");
		//Shuffle Cards
			for (int i = 0; i < deck.length; i++) {
				// Generate random index
				int index = (int)(Math.random() * deck.length);
				int temp = deck[i];
				deck[i] = deck[index]; 
				deck[index] = temp;
			}
			//Find total card value amount. Cards are dealt and we find the total amount in value of cards.
			int totalvalue = 0;
			for (int j = 0; j < 2; j++){
				int num = (int)((Math.random() * 13) -1);
				totalvalue += Integer.parseInt(numbervalue[num][1]);
				System.out.println("Total Card Value = " + totalvalue);
			}
			//Display two cards total value
			if (totalvalue >= 21){
				System.out.println("Stay");
			}
			else{
				System.out.println("Hit or Stay?");
					
			}
			String hp = input.next();
			hp = hp.toLowerCase();
			//Hit or pass. When the cards are valued at less than 16 hit. When cards are valued more than 17 pass.
			boolean again = true;
			while (again) {
				if(hp.equals("h")|| (hp.equals("hit")))	{
					int num = (int)((Math.random() * 13) -1);
					totalvalue += Integer.parseInt(numbervalue[num][1]);
					System.out.println("New total is " + totalvalue);
					if(totalvalue > 21){
						//System.out.println("New total is " + totalvalue);
						System.out.println("Bust");
						break;
					}
					System.out.println("Hit or Stay?");
					hp = input.next();
					hp = hp.toLowerCase();
				}
					
//				if(totalvalue > 21){
//					System.out.println("New total is " + totalvalue);
//					System.out.println("Bust");
//					break;
//				}
				if(hp.equals("s") || hp.equals("stay")) {
					System.out.println("Stay");
					again = false;
				}
			}
			System.out.println("Player total= " +totalvalue);
			System.out.println('\n');
			if(totalvalue > 21)
				return 0;
			else
				return totalvalue;
			
	}//end player method
	public static int dealer(int[] deck,String[][] numbervalue){
		System.out.println("DEALER");
		//Shuffle Cards
			for (int i = 0; i < deck.length; i++) {
				// Generate random index
				int index = (int)(Math.random() * deck.length);
				int temp = deck[i];
				deck[i] = deck[index]; 
				deck[index] = temp;
			}
			//Find total card value amount. Cards are dealt and we find the total amount in value of cards.
			int totalvalue = 0;
			for (int j = 0; j < 2; j++){
				int num = (int)((Math.random() * 13) -1);
				totalvalue += Integer.parseInt(numbervalue[num][1]);
				System.out.println("Total Card Value = " + totalvalue);
			}
			//Display two cards total value
				System.out.println("Your total card amount is " + totalvalue);
			//Hit or pass. When the cards are valued at less than 16 hit. When cards are valued more than 17 pass.
			while (totalvalue <= 16) {
				System.out.println("Hit");	
				int num = (int)((Math.random() * 13) -1);
				totalvalue += Integer.parseInt(numbervalue[num][1]);
				System.out.println("New total is " + totalvalue);	
			}
			if(totalvalue > 21){	
				System.out.println("Bust");
			}
			else{
				System.out.println("Stay");
			}
			System.out.println('\n');
			if(totalvalue > 21)
				return 0;
			else
				return totalvalue;
		    //end dealer method
		
	}
}