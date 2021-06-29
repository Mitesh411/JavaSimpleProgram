package com.java.Program;

public class ExceptionTryCatchBlock {
	public static void main(String[] args) {
		try {
			// Code that Generate Exception
			int divideByZero = 5 / 0;
			System.out.println("Rest of the Code in Try Block");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception => " +e.getMessage());
		}
	}
}
