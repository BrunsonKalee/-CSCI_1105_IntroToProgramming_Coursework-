//Author: Kalee Riddle Date: 4/8/19 This program will find the numbers of days in a month.

import java.util.Scanner;

class DaysinMonths {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		//Output
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		System.out.println("Enter a month ");
		int day = 0;
		String month = input.next();
		if ((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul")) || (month.equals("Aug")) || (month.equals("Oct")) || (month.equals("Dec"))){
			day = 31;
		}
		else if((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Sep")) || (month.equals("Nov"))){
		day = 30;
		}
		else { 
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
			if (isLeapYear){
				day = 29;
			}
			else {
				day = 28;
			}
		}
		System.out.println(month + " " + year + " " + "has " + day + " days");
	}
}