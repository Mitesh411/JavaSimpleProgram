package com.java.Program;

public class ThreeDimensionArray {
	public static void main(String[] args) {

		// Create a 3d Array
		int[][][] test = { { { 1, -2, 3 }, { 5, 6, 7 }

				}, { { 5, 6, 9 }, { 10, 12, 48 }, { 25, 85, 65 }

				} };
		// for...Each Loop to iterate through elements of 3d array
		for (int[][] is : test) {
			for (int[] is2 : is) {
			 for (int is3 : is2) {
				System.out.println(is3);
			}	
			}
		}
	}
}
