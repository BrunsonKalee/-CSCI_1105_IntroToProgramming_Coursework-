//Author: Kalee Riddle Date: 4/23/19 This program will find the numbers divisible by 5 or 6, but not both 5 and 6 between 100 and 200. 

public class FiveorSix {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 100; i <= 200; i++) {
			
			if (i % 6 == 0 ^ i % 5 == 0) {
				System.out.print((count++ % 10 !=0) ? + i + " " : i + "\n");
			}
		}
	}
}