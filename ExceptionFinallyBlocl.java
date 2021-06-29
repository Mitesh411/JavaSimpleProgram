package com.java.Program;

public class ExceptionFinallyBlocl {
	public static void main(String[] args) {
		try {
			// Code that Generates Exception
			int divideByZero=  5 / 0;
			
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception => "+ e.getMessage());
		
		}finally {
			// TODO: handle finally clause
			System.out.println(" This is a Finally Block");
		}
	}

}
