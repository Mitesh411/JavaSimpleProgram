package com.java.Program;

class FinalDemo{
	// Create a final method
	public final void display() {
		System.out.println("This is a Final method");
	}
}
	
public class FinalMethodDemo extends FinalDemo {
	// try to Override final method 
	public final void display() {
		System.out.println("The final method is Overrridden.");
	}
	
	public static void main(String[] args) {
		FinalMethodDemo obj = new FinalMethodDemo();
		obj.display();
	}


}
