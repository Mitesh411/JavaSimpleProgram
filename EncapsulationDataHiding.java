package com.java.Program;

class Person{
	// Private Field
	private int age;
	
	// Getter Method 
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}



public class EncapsulationDataHiding {
	public static void main(String[] args) {
		// Create an Object of Person
		Person pl = new Person();
		// Change age using setter 
		pl.setAge(25);
		// Access age using setter 
	     System.out.println("My Age is "+pl.getAge());
		
	}
	
}
