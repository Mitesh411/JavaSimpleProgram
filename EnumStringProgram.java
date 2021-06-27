package com.java.Program;

enum Sizing{
	SMALL, LARGE, MEDIUM, EXTRALARGE
}



public class EnumStringProgram {
	public static void main(String[] args) {
		System.out.println("String Value of Small is " + Sizing.SMALL.toString());
		System.out.println("String Value of Medium is " + Sizing.EXTRALARGE.name());
	}
}
