//Author: Kalee Riddle Date: 03/27/19 This program will convert between celcius degree and fahrenheit degree.
import java.util.Scanner;
public class CtoF {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//import new scanner
			System.out.println("Enter a degree in Celcius: ");
			double celsius = input.nextDouble();
			//declare double
			//Convert Celcius to Fahrenheit
			double fahrenheit = ((9.0 / 5) * celsius + 32);
			System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");

		}

}