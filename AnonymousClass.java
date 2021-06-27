package com.java.Program;


class hexagon{
	public void display() {
		System.out.println("Inside the hexagon class");
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		AnonymousDemo an = new AnonymousDemo();
		an.createClass();
	}
	
	
	
	
}

class AnonymousDemo {
	public void createClass() {
		// creation of anonymous class extending class hexagon
		hexagon hex = new hexagon() {
			public void display() {
				System.out.println("Inside in a anonymous class ");
			}
		};
		hex.display();
	}
}