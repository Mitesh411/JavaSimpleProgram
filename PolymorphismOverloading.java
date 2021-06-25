package com.java.Program;

class Pattern{
	// Method without Parameter
	public void display() {
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
		}
	}
	
	// Method with Single Parameter
	public void display(char symbol) {
		for (int i = 0; i < 10; i++) {
			System.out.println(symbol);
		}
	}
	
}

public class PolymorphismOverloading {
	public static void main(String[] args) {
		Pattern objpattern = new Pattern();
		// Call method without any argument 
		objpattern.display();
		System.out.println(" ");
	
		// Call method with a Single Argument 
		
		objpattern.display('#');
		
	}
}
