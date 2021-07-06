package com.java.Programs;

import java.util.NavigableMap;
import java.util.TreeMap;

public class CollectionNavigableMap {
	public static void main(String[] args) {
		// Creating NavigableMap using TreeMap
		NavigableMap<String, Integer> navinum = new TreeMap<>();
		
		//Insert Element into Map
		navinum.put("Two ", 2);
		navinum.put("One", 1);
		navinum.put("Three", 3);
		System.out.println("Navigable Map:- "+ navinum);
		
		//Access the First Entry of the Map 
		System.out.println("First Entry " + navinum.firstEntry());
		
		//Access the Last Entry of the map
		System.out.println("Last Entry " +navinum.lastEntry());
		
		//Remove the First Entry from the Map
		System.out.println("Removed the First Entry from Map :- "+ navinum.pollFirstEntry());
		
		// Remove the Last Entry from the Map
		System.out.println("Remove the Lat Entry " + navinum.pollLastEntry());
		
	}
}
