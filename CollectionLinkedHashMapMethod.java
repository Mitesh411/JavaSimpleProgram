package com.java.Programs;

import java.util.LinkedHashMap;

public class CollectionLinkedHashMapMethod {
	public static void main(String[] args) {
		// Creating LinkedHashMap of OddNumbers
		LinkedHashMap<String, Integer> oddnum = new LinkedHashMap<>();
		
		//Using put()
		oddnum.put("Two", 2);
		oddnum.put("Four", 4);
		System.out.println("Original Linked Hash Map :- "+oddnum);

		// Using putIfAbsent
		oddnum.putIfAbsent("Six", 6);
		System.out.println("Updated LinkedHashMap() :- " + oddnum);
		
		//Creating LinkedHashMap of numbers
		LinkedHashMap<String, Integer> numbs = new LinkedHashMap<>();
		numbs.put("One", 1);
		
		//Using putAll()
		numbs.putAll(oddnum);
		System.out.println("New Linked Hash Map :- "+numbs);
		
		
	}
}
