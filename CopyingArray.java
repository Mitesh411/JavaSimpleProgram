package com.java.Program;

public class CopyingArray {
	public static void main(String[] args) {
		// Create a Array
		int [] numbers = {1,2,3,4,5,6};
		int [] positiveNumbers = numbers; // copying arrays
		
		for (int i : positiveNumbers) {
			System.out.println( i + ",");
		}
		
	}
}
