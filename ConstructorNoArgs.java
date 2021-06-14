package com.java.Program;

public class ConstructorNoArgs {
	int i;
	
	//Constructor with no parameter
	
	private ConstructorNoArgs() {
		i = 5;
		System.out.println("Constructor is Called"); 
	}

	public static void main(String[] args) {
		// Calling Constructor without Parameter 
		ConstructorNoArgs obj = new ConstructorNoArgs();
		System.out.println("Value of i :- \t"+obj.i);
	}
	
}
