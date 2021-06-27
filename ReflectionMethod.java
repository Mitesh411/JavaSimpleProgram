package com.java.Program;
import java.lang.Class;
import java.lang.reflect.*;

class Blackhound{
	// methods of the Class
	public void display() {
		System.out.println("I am a Dog ");
	}
	
	private void makeSound() {
		System.out.println("Bark Bark");
	}
}

public class ReflectionMethod {
	public static void main(String[] args) {
		try {
			
			// create an object of BlackHound
			Blackhound db = new Blackhound();
			// create an object of class 
			// using getClass
			Class cls = db.getClass();			
			
			// using object of class to 
			// get all the declared methods of Blackhound
			Method[] methods = cls.getDeclaredMethods();
			
			
			// create an object of Method Class
			for (Method me : methods) {
				// get name of methods
				System.out.println("Method Name: "+me.getName());
				
				// get the access Modifier of the Methods
				int modifier = me.getModifiers();
				System.out.println("Modifiers : "+Modifier.toString(modifier));
				
				// get the return types of method 
				System.out.println("Return Types : "+ me.getReturnType());
				System.out.println(" ");
			
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
}
