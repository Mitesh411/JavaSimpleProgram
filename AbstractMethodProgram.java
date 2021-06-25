package com.java.Program;

abstract class Dogers {
	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat");

	}

}

class Puppy extends Dogers {
	// Provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}

public class AbstractMethodProgram {
	public static void main(String[] args) {
		// Create an Object of Dog Class
		Puppy obj = new Puppy();
		 obj.makeSound();
		 obj.eat();
	}
}
