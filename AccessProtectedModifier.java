package com.java.Program;

class Animal{
	//Protected Method
	protected void display() {
		System.out.println("I am an Animal");
	}
}


public class AccessProtectedModifier  extends Animal{
	public static void main (String[] args) {
		// create an object of Dog Class
		AccessProtectedModifier obj = new AccessProtectedModifier();
		// Access Protected Modifier
		obj.display();
	}
}
