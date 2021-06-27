package com.java.Program;


class Anisis{
	// inner class
	class Repti{
		public void displayInfo() {
			System.out.println("I am a reptile");
		}
	}
	
	
	// static class 
	static class mammal{
		public void displayInfo(){
			System.out.println("I am a mammal. ");
		}
	}
	
}



public class StaticNestedClass {
	public static void main(String[] args) {
		// Object creation of Outer Class
		Anisis animal = new Anisis();
		
		// Object creation of the non-static class
		Anisis.Repti reptile = animal.new Repti();
		reptile.displayInfo();
		
		// Object creation of the static nested class
		Anisis.mammal mams = new Anisis.mammal();
		mams.displayInfo();
	}
}
