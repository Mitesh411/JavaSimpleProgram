package com.java.Program;

import java.util.LinkedList;

public class CollectionLinkedList {
	public static void main(String[] args) {
		// Create LinkedList
		LinkedList<String> lls = new LinkedList<>();
		
		// Add Element to LinkedList
		lls.add("Dog");
		lls.add("Cat");
		lls.add("Cow");
		System.out.println("Linked List :- "+lls);
		
		// add() method with the index parameter
		lls.add(1, "Horse");
		System.out.println("Updated Linked List "+lls);
		
		// get() the element from the Linked List 
		String strs = lls.get(3);
		System.out.println("Element at the index 3 :- "+strs);
		
		// Change the Element at the Index 3
		lls.set(3, "Bull");
		System.out.println("Updated Linked List :- "+lls);
		
		
		// Remove the Element from index 1
		String remo = lls.remove(1);
		System.out.println("Removed Element "+remo);
		
	}
}
