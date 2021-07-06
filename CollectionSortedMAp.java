package com.java.Programs;

import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionSortedMAp {
	public static void main(String[] args) {
		//Creating SortedMap using TreeMap
		SortedMap<String, Integer> sortnum = new TreeMap<>();
		
		//Insert elements to map
		sortnum.put("Two", 2);
		sortnum.put("One", 1);
		System.out.println("Sorted Map :- "+sortnum);
		
		//Access the first Key of the Map 
		System.out.println("FirstKey :- " +sortnum.firstKey());
		
		//Access the last key of the Map
		System.out.println("Last Key :- " +sortnum.lastKey());
		
		//Remove the Elements from the Top
		int value = sortnum.remove("One");
		System.out.println("Removed Value :- "+ value);
		
	}
}
