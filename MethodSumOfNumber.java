package com.java.Program;

import java.nio.charset.MalformedInputException;

public class MethodSumOfNumber {
// Create a Method 
	int addNumbers(int a, int b) {
		int sum = a + b;
		System.out.println("\n Sum is ="+sum);
		//return value
		return sum;
		
	}
	
	public static void main(String[] args) {
		int a= 10, b=20;
		
		//Create a Object of Main Method
		MethodSumOfNumber obj = new MethodSumOfNumber();
		
		// Calling Method 
		obj.addNumbers(a, b);
		//int result = obj.addNumbers(a, b);
		//System.out.println("Sum is ="+result);

			
	}
	
	
}
