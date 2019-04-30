// Author: Kalee Riddle Date: 4/29/19 The program will convert milliseconds to hours, minutes, and seconds.

import java.util.Scanner;

public class Milliseconds {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Prompt user
		System.out.print("Milliseconds: ");
		long milli = input.nextLong();
		
		//Convert to hours, min, sec
		System.out.println("hours:minutes:seconds: " + convertMilli(milli));
	}
	//Conversion
	public static String convertMilli(long milli) {
		//obtain total seconds
		milli /= 1000;
		
		//Obtain current minute
		String currentMinAndSec = "";
		for (int i = 0; i < 2; i++){
			currentMinAndSec = ":" + milli % 60 + currentMinAndSec;
			milli /= 60;
		}
		return milli + currentMinAndSec;
	}
}