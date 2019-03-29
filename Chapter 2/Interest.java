//Author: Kalee Riddle Date: 03/28/19 This program will calculate the interest after six months.
import java.util.Scanner;
public class Interest {
		public static void main(String[] args) {
			//Creating Scanner
			Scanner input = new Scanner(System.in);
			//Enter monthly amount
			System.out.println("Please enter the current savings amount ");
			double r = input.nextDouble();
			//equations for each system
			double a = r * (1 + 0.00417);
			double b = (a + r) * (1 + 0.00417);
			double c = (b + r) * (1 + 0.00417);
			double d = (c + r) * (1 + 0.00417);
			double e = (d + r) * (1 + 0.00417);
			double f = (e + r) * (1 + 0.00417);
			System.out.println("Month one " + a);
			System.out.println("Month two " + b);	
			System.out.println("Month three " + c);		
			System.out.println("Month four " + d);
			System.out.println("Month five " + e);				
			System.out.println("Month six equals " + f);	
			
							
			
		}

}