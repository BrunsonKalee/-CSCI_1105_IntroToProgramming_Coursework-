# BlackJack
## Synopsis
This game allows one player to learn how to play Blackjack against a dealer easily. 
## Motivation
I decided to code this game because I liked a card game example in a book and wanted to expand on the example and make it into something of my own.
## How to Play
To play, decide whether or not to hit or stay and get a total value of '21', between one player and the dealer, to win. If the dealer has a higher number than the player, the dealer wins. When the player has a higher number than the dealer, the player wins. If either of them go over '21' they are going to bust. At the end of the game click 'Y' or 'N' when deciding to play again or not.
## Code Snip 
This piece of code shows the players side of the game. 
```
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

  ```
