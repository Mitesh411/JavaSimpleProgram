package com.java.Program;

abstract class Bird {
	abstract void makeSound();
}

class Eagle extends Bird{
	// implementation of abstract method 
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}

class Pigeon extends Bird{
	// Implementation of abstract method 
	public void makeSound() {
		System.out.println("Meows");
	}
}

public class AbstractionSimpleProgram {
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		obj.makeSound();
		
		Pigeon obj1 = new Pigeon();
		obj1.makeSound();
		
	}
}
