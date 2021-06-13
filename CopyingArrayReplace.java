package com.java.Program;

public class CopyingArrayReplace {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8,9};
		int[] positiveNumbers = a;   //copying arrays
		
		//change the value of  first array
		a[0] = -1;
		
		//printing the second array 
		for ( int i : positiveNumbers) {
			System.out.println(i+" ,");
		}
	}
}
