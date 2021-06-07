package com.java.Program;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		char operator;
		Double number1, number2, result;

		// Create a Object of Scanner Class
		Scanner input = new Scanner(System.in);

		// Ask User to enter Operator
		System.out.println("\n Choose an Operator :- +,-,*, or /");
		operator = input.next().charAt(0);

		// Ask User to Enter Number
		System.out.println("\n Enter the First Number ");
		number1 = input.nextDouble();

		System.out.println("\n Enter the Second Number ");
		number2 = input.nextDouble();

		switch (operator) {

		// Performs Addition between numbers
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			break;
		// Performs Subtraction between numbers
		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			break;

		// Performs Multiplication between numbers
		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			break;
		// Performs Addition between numbers
		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 +  "="  + result);
			break;

		default:
			System.out.println("\n Invalid Opertor Entered");
			break;

		}
		input.close();	
	}
}
