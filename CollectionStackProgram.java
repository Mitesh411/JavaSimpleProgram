package com.java.Program;

import java.util.Stack;

public class CollectionStackProgram {
	public static void main(String[] args) {
	Stack<String> anims = new Stack<>();
	
	//Add Elements to Stack
	anims.push("Dog");
	anims.push("Cats");
	anims.push("Horse");
	anims.push("Donkey");
	anims.push("Monkey");
	System.out.println("Initial Stack :- "+anims);
	
	// Remove elements Stack 
	String eles = anims.pop();
	System.out.println("Removed Elements : "+eles);
	
	//  Access the Element from the Top
	String elepeek = anims.peek();
	System.out.println("Element at the Top: "+elepeek);
	
	// Search an Element 
	int position = anims.search("Horse");
	System.out.println("Position of Horse: "+position);
	
	// Check if Stack is Empty 
	boolean result = anims.empty();
	System.out.println("Is Stack is Empty "+result);
	
	}
}
