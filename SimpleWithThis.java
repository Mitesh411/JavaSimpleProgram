package com.java.Program;

public class SimpleWithThis {
	int age ;
	public SimpleWithThis(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		SimpleWithThis obj = new SimpleWithThis(8);
		System.out.println("obj.age = "+obj.age);
	}
	
}
