//Author: Kalee Riddle Date: 4/8/19 This program will find the area of a pentagon.

import java.util.Scanner;


class AreaofPentagon {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Enter input
		System.out.println("Please enter a length from the center of the pentagon to a vertex ");
		double r = input.nextDouble();
		double side = (2 * r) * (Math.sin(Math.PI/5));
		double area = (5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5)));
		System.out.println("The area of the pentagon is " + area);
	}
}