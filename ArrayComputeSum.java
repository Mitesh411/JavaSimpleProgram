package com.java.Program;

public class ArrayComputeSum {
	public static void main(String[] args) {
		int[] numbers = { 5, 10, 15, -2, -8, 20, 30 };
		int sum = 0;
		Double average;

		// access all element using for each loop
		// add each element in sum

		for (int number : numbers) {
			sum = sum + number;

		}
		
		// get the total number of Elements
		int arraylength = numbers.length;
		
		
		//Calculate the average
		//convert the average from int to double
		
		average = ((double)sum / (double)arraylength);
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
		
		
		
		
	}

}
