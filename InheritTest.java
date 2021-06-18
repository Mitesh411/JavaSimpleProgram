package com.java.Program;

//class Animal {
//	void eat() {
//		System.out.println("Eating");
//	}
//}

class Dog {
	void bark() {
		System.out.println("Barking");
	}
}

class BabyDog extends Dog{
	void weep() {
		System.out.println("Weeping");
	}
}


public class InheritTest {
	public static void main(String[] args) {
		BabyDog obj = new BabyDog();
		//obj.eat();
		obj.weep();
		obj.bark();
		
	}
}
