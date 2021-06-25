package com.java.Program;

class ComputerLanguage{
	public void display() {
		System.out.println(" I am Programming Language");
	}
	
}

class Java extends ComputerLanguage{
	@Override
	public void display() {
		System.out.println("I am Object Oriented Programming Language");
	}
}

public class PolymorphicVariables {
	public static void main(String[] args) {
		// Declare an Object Variable
		ComputerLanguage pl;
		
		// Create an Object of Programming language
		pl = new ComputerLanguage();
		pl.display();
		
		// Create an Object Java Class
		pl = new Java();
		pl.display();
		
		
	}
}
