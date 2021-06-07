package com.java.Program;

// Print Array Element 
public class ForEachLoop {
	public static void main (String[] args ) {
		//create an array 
		int[] numbers = {3, 7, 5, -5,11, 15,-10};
		
		// iterating through the array
		for (int print: numbers) {
			System.out.println("\n "+print);
		}
	}

}
