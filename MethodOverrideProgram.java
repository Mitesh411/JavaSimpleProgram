package com.java.Program;

class Animal1{
	public void displayInfo() {
		System.out.println("I am an animal");
	}
}

class Test extends Animal1{
	@Override
	public void displayInfo() {
		System.out.println("I am a Dog");
	}
}


public class MethodOverrideProgram {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.displayInfo();
	}
}
