package com.java.Program;

public class MethodParameterProgram {
	// Method with no parameter
	public void display1() {
		System.out.println("\n Method without Parameter");
		}

	// Method with Single Parameter
	public void display2(int a) {
		System.out.println("\n Method with Single Parameter :-\t"+a);
	}

	public static void main(String[] args) {
		// Create an object of Main
		MethodParameterProgram obj = new MethodParameterProgram();
		
		// Calling Method with no Parameter
		obj.display1();
		
		// Calling Method with Single Parameter
		obj.display2(5);
		
	}

}
