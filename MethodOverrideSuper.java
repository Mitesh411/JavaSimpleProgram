package com.java.Program;

class Animals{
	public void displays() {
		System.out.println("I am an animal");
	}
}


class Doge extends Animals {
	public void displays() {
		super.displays();
		System.out.println("I am a Dog");
	}
}

public class MethodOverrideSuper {
	public static void main(String[] args) {
		Doge obj1 = new Doge();
		obj1.displays();
	}
}
