package com.java.Program;

interface Polygon {
	  void getArea();

	  // default method 
	  default void getSides() {
	    System.out.println("I can get sides of a polygon.");
	  }
	}

	// implements the interface
	class Rectan implements Polygon {
	  public void getArea() {
	    int length = 6;
	    int breadth = 5;
	    int area = length * breadth;
	    System.out.println("The area of the rectangle is " + area);
	  }

	  // overrides the getSides()
	  public void getSides() {
	    System.out.println("I have 4 sides.");
	  }
	}

	// implements the interface
	class Square implements Polygon {
	  public void getArea() {
	    int length = 5;
	    int area = length * length;
	    System.out.println("The area of the square is " + area);
	  }
	}

 class InterfaceDefaultMethod {
	public static void main(String[] args) {
		// create an object of Rectangles
		Rectan obj = new Rectan();
		obj.getArea();
		obj.getSides();
		
		// Create an object of Square
		Square obj1 = new Square();
		obj1.getArea();
		obj1.getSides();
	}
}
