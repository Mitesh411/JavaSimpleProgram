package com.java.Programs;

import java.util.HashMap;

public class CollectionHashMapProgram {
	public static void main(String[] args) {
		//Create a HashMap
		HashMap<Integer, String> langs = new HashMap<>();
		System.out.println("Initial HashMap :-"+langs);
		//add elements to HashMap
		langs.put(1,"Java");
		langs.put(4,"JavaScript");
		langs.put(5,"Python");
		System.out.println("HashMap After Put :- "+langs);
		
		//get() method to get Value
		String vals=langs.get(5);
		System.out.println("Value at Index 1:-"+vals);
		
		
		//return set view of keys
		//using keySet ()
		System.out.println("Keys"+langs.keySet());

		//return set view of Values
		// using values 
		System.out.println("Values "+langs.values());
		
		// return set view of key/values pairs
		// using entrySet()
		System.out.println("Key / Value Mapping :- "+langs.entrySet());
	
		// Change the Element with Key 2
		langs.replace(4,"C" );
		System.out.println("HashMap using replace(): "+langs);
		
		//Remove the HashMap associated with value 4
		langs.remove(4);
		System.out.println("Removed Value :- "+langs);
	}

}
