package com.java.Program;

public class SimpleStringCompare {
	public static void main(String[] args) {
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";
		
		// Compare first String with second Strings
		boolean result = first.equals(second);
		System.out.println("Compare first String with Second String " +result);
		
		// Compare Second String with Third Strings
		boolean result1 = second.equals(third);
		System.out.println("Compare Second String with Third String " +result1);
		
 	}
}
