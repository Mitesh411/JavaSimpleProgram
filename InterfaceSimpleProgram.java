package com.java.Program;

interface polygon{
	void getArea(int length, int breadth) ;
}

// implement the Polygon interface
class Rectangle implements polygon{
	// implements of abstract method 
	public void getArea(int length, int breadth) {
		System.out.println("The area of Rectangle is " + (length * breadth));
	}
}

public class InterfaceSimpleProgram {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.getArea(5, 10);
	}
}
