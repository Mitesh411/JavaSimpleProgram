package com.java.Program;

import java.util.Iterator;
import java.util.Vector;

public class CollectionVectorProgram {
	public static void main(String[] args) {
		Vector<String> mams = new Vector<>();
		
		//Using the Add() Method 
		mams.add("Dog");
		mams.add("Horse");
		
		// Using Index Number 
		mams.add(2, "Cat");
		System.out.println("Vector: "+mams);
				
		// Using addAll()
		
		Vector<String> wildani = new Vector<>();
		wildani.add("Crocodile");
		
		wildani.addAll(mams);
		System.out.println("New Vector :- "+wildani);
		
		// Using get()
		String ele = wildani.get(3);
		System.out.println("\n Element at index 3 " + ele);
		
		// Using Iterator 
		Iterator<String> iterate = wildani.iterator();
		System.out.println("\n Vector :");
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(", ");
			
		}
	}
}
