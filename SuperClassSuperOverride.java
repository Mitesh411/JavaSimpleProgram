package com.java.Program;

 class Cow{
	// Overridden method
	public void display() {
		System.out.println("I am an animal");
	}
}

 class calf extends Cow{
	 // Overriding method
	 @Override
	 public void display() {
		 System.out.println("I am a Dog");
	 }
	 
	 public void printMessage() {
		 // this is called Overriding method
		 display();
		 // this is called Overridden method
		 super.display();
		 
	 }
 }



public class SuperClassSuperOverride {
	public static void main(String[] args ) {
		calf obj = new calf();
		obj.printMessage();
		
	}
}
