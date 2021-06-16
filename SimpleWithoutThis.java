package com.java.Program;

public class SimpleWithoutThis {
	int age;
	public SimpleWithoutThis(int age) {
		// TODO Auto-generated constructor stub
		age = age;
			
	}
	
	public static void main(String[] args) {
		SimpleWithoutThis obj = new SimpleWithoutThis(8);
		System.out.println("obj.age = "+ obj.age);
	}
	
}
