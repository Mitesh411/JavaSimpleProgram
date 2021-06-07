package com.java.Program;

// Calculate the Sum of all Elements of Array 
public class SumOfArray {
	public static void main(String[] args) {
		// an array of numbers
		int[] numbers = {3,5,8,9,10,15,48};
		int sum = 0;
		
		//iterating through each element of the array
		for(int number: numbers) {
			sum +=number;
			
		}
		
		System.out.println("Sum = "+sum);
	}
}
