package com.java.Program;

class Bird{
	//default or no-arg constructor of class bird
	public Bird() {
		System.out.println(" I am an Bird");
		
	}

}

class Eagle extends Bird{
	// default or no-args constructor of Class Bird
	public Eagle() {
		// calling default constructor of the superclass
		super();
		System.out.println(" I am a Dog");
		
	}
}



public class SuperClassSuperConstructor {
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		
	}
}
