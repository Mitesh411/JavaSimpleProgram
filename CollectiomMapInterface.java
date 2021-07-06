package com.java.Programs;

import java.util.HashMap;
import java.util.Map;

public class CollectiomMapInterface {
	public static void main(String[] args) {
		// Creating a Map using the HashMap
		Map<String, Integer> numbers = new HashMap<>();
		
		// Insert element to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		System.out.println("Map:-"+numbers);
		
		
		//Access the keys of the Map
		System.out.println("Keys:- "+numbers.keySet());
		
		//Access Values of the Map
		System.out.println("Values:- "+numbers.values());
		
		//Access the Entries of the Map
		System.out.println("Entries :- "+numbers.entrySet());
		
		//Remove the Element from the Map 
		int value = numbers.remove("Two");
		System.out.println("Removed Value :-"+value);
		
		
		
		
		
	}
}
