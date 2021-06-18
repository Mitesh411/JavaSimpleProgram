package com.java.Program;

class Animalss{
	protected void displaying() {
		System.out.println("I am an animal");
	}
}

class Doging extends Animalss{
	public void displaying() {
		System.out.println("I am a Dog");
	}
}


public class MethodOverridingAccess {
	public static void main(String[] args) {
		Doging obj = new Doging();
		obj.displaying();
	}
}
