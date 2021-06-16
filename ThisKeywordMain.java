package com.java.Program;

public class ThisKeywordMain {
	private int a, b;

	// Constructor with 2 Parameters
	private ThisKeywordMain(int i, int j) {
		this.a = i;
		this.b = j;
	}

	// Constructor with Single Parameter
	private ThisKeywordMain(int i) {
		// Invokes the Constructor with 2 parameter
		this(i, i);
	}

	// Constructor with no parameter
	private ThisKeywordMain() {
		// invokes the constructor with single Parameter
		this(0);

	}
	
	@Override
	public String toString() {
		return this.a + " + " + this.b + "i";
	}
	
	public static void main(String[] args) {
		// Creating Object of ThisKeywordMain Class
		// call the Constructor with two parameters
		ThisKeywordMain obj = new ThisKeywordMain(2,3);
		
		//Calls the Constructor with a Single Parameter
		ThisKeywordMain obj1 = new ThisKeywordMain(8);
		
		//Calls the Constructor with no parameters
		ThisKeywordMain obj3 = new ThisKeywordMain();
		
		// Prints Objects
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj3);
		
	}
	
	
}
