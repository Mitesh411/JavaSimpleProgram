package com.java.Program;

import java.util.Scanner;

public class DoWhilePositiveNumber {
	public static void main(String[] args ) {
		int sum = 0;
		int number = 0;
		
		// create a object of scanner class
		Scanner input = new Scanner(System.in);
		
		//do...while loop continues 
		// Until entered number is positive 
		do {
			// adds only positive number
			sum = sum + number;
			System.out.println("\n Enter a number :-" );
			number = input.nextInt();
		} while (number >=0);
		System.out.println("Sum = "+sum);
		input.close();
	}	
}
