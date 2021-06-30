package com.java.Program;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayListOperation {
	public static void main(String[] args) {
		// Create an ArrayList 
		
		ArrayList<String> langs= new ArrayList<>();
		
		//add() method without the index parameter
		langs.add("Java");
		langs.add("C");
		langs.add("Python");
		langs.add("PHP");
		System.out.println("Array List "+langs);
		
		
		//add() method with the index parameter 
		langs.add(1, "C++");
		System.out.println("Updated ArrayList :- "+langs);
		
		
		// Get the Size of the ArrayList 
		System.out.println("Size of the ArrayList "+langs.size());
	
		// iterate through the Loop
		for (String string : langs) {
			System.out.println(string);
			System.out.println("");
		}
		
		
	}
}
