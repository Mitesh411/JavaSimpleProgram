package com.java.Program;

import java.util.LinkedList;
import java.util.List;

public class CollectionLinkedListClass {
	public static void main(String[] args) {
		// Creating list using the Linked List Class
		List<Integer> numbs = new LinkedList<>();
		
		//Add Elements to the List 
		numbs.add(1);
		numbs.add(2);
		numbs.add(3);
		numbs.add(4);
		System.out.println("List : "+numbs);
		
		// Access the Elements from the List 
		int number = numbs.get(2);
		System.out.println("Accessed Elements: "+number);
		
		// Using the indexOf() method
		int index = numbs.indexOf(2);
		System.out.println("Position of 3 is "+ index);
		
		//Remove the element from the List 
		int removedNumbers  = numbs.remove(1);
		System.out.println("Removed Elements: - "+removedNumbers);
		
	}
}
