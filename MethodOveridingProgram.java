package com.java.Program;


// Dog inherits Animal
class Dogster {
	// overriding the eat() method
	
	public void eat() {
		System.out.println("I eat dog Food");
	}

// new method in Subclass 
	public void bark() {
		System.out.println("I can bark");
	}
}

public class MethodOveridingProgram {
	public static void main(String[] args) {
		// create object of subclass
		Dogster obj = new Dogster();
		// call the eat method
		obj.eat();
		obj.bark();
		
	}
}
