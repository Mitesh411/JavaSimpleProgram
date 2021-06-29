package com.java.Program;
public class ExceptionThrowProgram {
	public static void dividebyzero() {
		// Throw an Exception
		throw new ArithmeticException("Trying to Divide by 0");
	}

	public static void main(String[] args) {
		dividebyzero();
	}
}
