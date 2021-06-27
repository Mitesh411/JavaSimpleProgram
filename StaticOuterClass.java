package com.java.Program;

// Accessing Non-Static Members

class Anibus{
	static class Mamus {
		public void displayInfo() {
			System.out.println("I am an Mammal");
		}

		public void eat() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	class Reps{
		public void displayInfo() {
			System.out.println("I am a Reptile ");
		}
	}
	
	public void eat() {
		System.out.println("I eat Food");
	}
	
}




public class StaticOuterClass {
	public static void main (String[] args) {
		Anibus ani = new Anibus();
		Anibus.Reps reptile = ani.new Reps();
		reptile.displayInfo();
		
		Anibus.Mamus mam = new Anibus.Mamus();
		mam.displayInfo();
		mam.eat();
		
	}
}
