package com.java.Program;

public class TwoDimensionForEach {
	public static void main(String[] args) {
		
		//Create a 2D array
		int [][] a = {
				{1,2,3},
				{-4,-6,-9},
				{7}
		};
		
		// first for...each loop access the individual array
		// inside the 2d array
		for (int[] innerArray : a) {
		// Second for...each Loop access each element inside the row
			for (int data : innerArray) {
				System.out.println(data);
				
			}
		}
		
	}
}
