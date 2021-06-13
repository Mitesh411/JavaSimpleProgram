package com.java.Program;

import java.util.Arrays;

// To Use ToString() and copyofRange() method 
public class ArrayCopyOfRange {
	public static void main (String[] args) {
		int[] source = {2,5,6,9,10,44,15};	
		
		//Copy entire Source array to destination 
		int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
		System.out.println("destination1 = "+ Arrays.toString(destination1));
	
		//Copying from index 2 to 5 (5 is not included)
		
		int[] destination2 = Arrays.copyOfRange(source, 2, 5);
		System.out.println("destination2 = "+Arrays.toString(destination2));
	}
}
