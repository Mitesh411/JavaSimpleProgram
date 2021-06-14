package com.java.Program;

public class ConstructorDefault {
	int a ;
	boolean b;
	
	
	// A Private Constructor
	private ConstructorDefault() {
		a = 0;
		b = false;
		
	}
	
	public static void main(String[] args) {
		// A Default constructor is called 
		
		ConstructorDefault obj = new ConstructorDefault();
		System.out.println("Default Value ");
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
	}
	
}
