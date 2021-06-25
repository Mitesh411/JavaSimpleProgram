package com.java.Program;

class Octagon{
	//Method to render Shape
	public void render() {
		System.out.println("Rendering Octagon .....");
	}
}

class Squa extends Octagon{
	// render Square
	public void render() {
		System.out.println("Rendering Square .... ");
	}
}


class Circles extends Octagon {
	// Renders Circle
	public void render () {
		System.out.println("Rendering Circle...");
	}
}
public class PolymorphismSimpleProgram {
	public static void main(String[] args) {
		// Create an Object of Square
		Squa objOne = new Squa();
		objOne.render();
		
		// Create an Object of Circle 
		Circles objTwo = new Circles();
		objTwo.render();
	}
	
}
