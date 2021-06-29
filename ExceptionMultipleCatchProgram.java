package com.java.Program;

public class ExceptionMultipleCatchProgram {
	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
