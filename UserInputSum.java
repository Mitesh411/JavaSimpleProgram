package com.java.Program;

import java.util.Scanner;

public class UserInputSum {
	public static void main(String[] args) {

		Double number, sum = 0.0;

		// Create a Object of scanner
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number :- ");

			// takes double input from user
			number = input.nextDouble();

			// if number is in negative then terminates loop
			if (number < 0.0) {
				break;
			}
			sum = sum + number;

		}
		System.out.println("Sum " + sum);
	}
}
