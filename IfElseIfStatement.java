package com.java.Program;

public class IfElseIfStatement {
	public static void main(String[] args) {
		int number = -10;

		// Check If Number is Greater than 0
		if (number > 0) {
			System.out.println("\n This is a Positive Number ");
		}
		// Check if number is less than 0
		else if (number < 0) {
			System.out.println("\n The Number is Negative Number");
		}

		// if both condition is false
		else {
			System.out.println("\n The Number is 0");
		}
	}
}
