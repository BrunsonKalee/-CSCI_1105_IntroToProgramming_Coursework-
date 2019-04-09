//Author: Kalee Riddle Date: 4/8/19 This program will read the following information and print a payroll statement.

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Input
		System.out.println("Enter employee's name: ");
		String name = input.next();
		System.out.println("Enter the numbers of hours worked: ");
		double hoursWorked = input.nextDouble();
		System.out.println("Enter the hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		//Variables
		double grossPay = payRate * hoursWorked;
		double fedwithRate = grossPay * fedRate;
		double statewithRate = grossPay * stateRate;
		double totalDeduction = fedwithRate + statewithRate;
		double netPay = grossPay - totalDeduction;
		 
		//Output Solutions
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);		
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + grossPay);		
		System.out.println("Deduction: ");		
		System.out.println("\tFed Withholding (" + (fedRate*100) +
						"): " + (fedwithRate));
				System.out.println("\tState Withholding (" + (stateRate*100) +
						"): " + (statewithRate));
				System.out.println("\tTotal Deduction: " + totalDeduction);
				System.out.println("Net Pay: " + netPay);		

	}
}