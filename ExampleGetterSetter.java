package com.java.Program;

public class ExampleGetterSetter {
	String name;

	// Setter method
	void setName(String name) {
		this.name = name;

	}

	// Getter Method
	String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		ExampleGetterSetter obj = new ExampleGetterSetter();
		obj.setName("Hello World");
		System.out.println("obj.name " +obj.getName());
		
	}
}
