package com.java.Program;

public class SimpleStringJoin {
	public static void main(String[] args) {
		
		//Create First String 
		String First = "JAVA";
		System.out.println("First String:\t"+First);
		
		// Create Second String
		String Second = " Programming";
		System.out.println("Second String: \t"+Second);
	
		// Join the Two String
		String joinedString = First.concat(Second);
		System.out.println("Joined String "+ joinedString);
	
	
	}
}
