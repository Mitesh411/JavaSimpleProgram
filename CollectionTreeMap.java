package com.java.Programs;

import java.util.Map;
import java.util.TreeMap;

public class CollectionTreeMap {
	public static void main(String[] args) {
		//Creating Map using TreeMap
		Map<String, Integer> maps = new TreeMap<>();
		
		// Insert Element to Map 
		maps.put("Second", 2);
		maps.put("One", 1);
		System.out.println("Map using TreeMap :- "+maps);
		
		// Replacing the Values 
		maps.replace("One", 11);
		maps.replace("Second", 23);
		System.out.println("New Map:- "+maps);
	
		//Remove the element from map 
		int removedvalue = maps.remove("One");
		System.out.println("Removed Values :-"+removedvalue);
	}
}
