//Author: Kalee Riddle Date: 5/9/19 The program will tell how many lockers remain open.

public class LockerPuzzle {
	public static void main(String[] args) {
		boolean[] locker = new boolean[100];
		//boolean isOpen = false;
		for (int i = 1; i <= locker.length; i++){
			for (int j = i-1; j < locker.length; j += i){
				locker[j] = !locker[j];
			}
		}
		
		//Display all lockers that are open
		System.out.println("All open lockers: ");
		for(int i =0 ; i < locker.length; i++){
			if(locker[i] == true)
			System.out.print(" " + (i + 1));
		}
	
	}
}