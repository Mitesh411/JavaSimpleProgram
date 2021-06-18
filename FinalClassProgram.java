package com.java.Program;

// Create a Final Class
final class FinalClassOne{
	public void display() {
		System.out.println("This is a final method");
	}
}

// try to extend the final class
public class FinalClassProgram extends FinalClassOne {
	public void display() {
		System.out.println("The Final Method is Overridden");
	}
	
	public static void main(String[] args) {
		FinalClassProgram obj = new FinalClassProgram();
		obj.display();
	}
}
