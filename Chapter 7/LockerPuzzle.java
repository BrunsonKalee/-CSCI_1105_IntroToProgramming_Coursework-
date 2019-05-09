//Author Kalee Riddle Date 5/8/19 This program will find all the locker that are open.

import java.util.Scanner;

public class LockerPuzzle {
	public static void main(String[] args) {
		 boolean[] lockers = new boolean[101];
		 //Open first set of lockers before next
			for (int i = 1; i < lockers.length; i++) {
				lockers[i] = true;
			}
		//Lockers left open
			for (int i = 2; i <= 100; i++) {
			for (int j = 1; i * j <= 100; j++) {
				lockers[i * j] = (lockers[i * j] == true) ? false : true;
				}
			}
		//Display open lockers
			for (int i = 0; i < lockers.length; i++) {
				if (lockers[i] == true)
					System.out.println("Locker " + i + " is open.");
			}
	}
}