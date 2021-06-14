package com.java.Program;

public class MethodOverloading {
	public static void display(int a) {
		System.out.println("Argument:- "+a);
	}
	
	public static void display(int a, int b) {
		System.out.println("Argument :" +a+" & " +b);
	}
	
	public static void main (String[] args) {
		display(1);
		display(5,10);
	}
	
}
