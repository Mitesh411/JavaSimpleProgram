package com.java.Program;

public class ConstructorParameterized {
	String languages;
	
	// Constructor Accepting Single Value 
	
	public ConstructorParameterized(String lang) {
		languages = lang;
		System.out.println(languages+" Programming Language");
	}
	
	public static void main(String[] args) {
		// Call Constructor by passing a single Value
		ConstructorParameterized obj = new ConstructorParameterized("Java");
		ConstructorParameterized obj1 = new ConstructorParameterized("PYTHON");
		ConstructorParameterized obj3 = new ConstructorParameterized("PHP");
		
	}
	
}
