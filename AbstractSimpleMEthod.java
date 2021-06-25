package com.java.Program;

abstract class Language{
	// method of abstract class 
	public void display() {
		System.out.println("This is Java Programming");
	}
}


public class AbstractSimpleMEthod extends Language {
	public static void main(String[] args) {
		// Create an object of Main
		AbstractSimpleMEthod obj = new AbstractSimpleMEthod();
		// Access Method of Abstract Class
		// Using object of AbstractSimpleMethod
		obj.display();
		
		
	}
}
