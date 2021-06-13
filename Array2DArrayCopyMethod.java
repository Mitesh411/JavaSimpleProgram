package com.java.Program;

import java.util.Arrays;
//we can see that we get the same output by replacing the inner for loop with the arraycopy() method

public class Array2DArrayCopyMethod {
	public static void main(String[] args) {
		int [][] source= {
						  {1,2,3,4},
						  {5,6},
						  {0,2,42,-4,5}
		};
		
		
		int[][] destination = new int[source.length][];
		for (int i = 0; i < source.length; i++) {
			//allocating space for each row of destination array 
			destination[i] = new int [source[i].length];
			System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
		
		
		}
		//displaying destination array 
		System.out.println(Arrays.deepToString(destination));
	}
}
