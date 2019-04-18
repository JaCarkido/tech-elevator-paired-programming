package com.techelevator;

import java.util.Scanner; // This is the scanner 

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //defines scanner object to access the keyboard
		double aBill = 0; // a variable to hold the keyoard input 
		double tendered = 0;
		double change = 0;
		
		
		String input ="";
		
		System.out.println("Please enter the amount of the bill.");
		input = keyboard.nextLine();
		aBill = Double.parseDouble(input);
		
		System.out.println("Please enter the amount of the tendered.");
		input = keyboard.nextLine();
		tendered = Double.parseDouble(input);
		
		change = (tendered - aBill);
		System.out.printf("Bill total %.2f\n", aBill);
		System.out.printf("Amount tendered %.2f\n", tendered);
		System.out.printf("Change %.2f\n", change);
	}
}
