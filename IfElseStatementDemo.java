package com.java.Program;

public class IfElseStatementDemo {
	public static void main(String[] args) {
		int number = -10;
		
		// Check the number is greater than 0
		if (number > 0) {
			System.out.println("\n The Number is Positive Number");
		}
		
		// execute this block 
		// if number is not greater than 0
		else {
			System.out.println("This is not a positive ");
		}
		System.out.println("\n Statement Outside If..Else Block");
	}
}
