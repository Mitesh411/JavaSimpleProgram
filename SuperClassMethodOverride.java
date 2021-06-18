package com.java.Program;

class Ani{
	// Overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

class Cat extends Ani{
	//Overriding methods 
	@Override
	public void display() {
		System.out.println("I am a Dog");
	}
	
	public void printMessage() {
		display();
	}
}

public class SuperClassMethodOverride {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.printMessage();
	}
}
