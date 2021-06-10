package com.java.Program;

public class ArrayforLoop {
	public static void main(String[] args) {
		int[] age = { 25, 35, 45 };
		// Loop through the array
		// using for Loop

		System.out.println("USing For Loop");
		for (int i = 0; i < age.length; i++) {
			System.out.println("\t" + age[i]);
		}

	}
}
