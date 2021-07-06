package com.java.Programs;

import java.util.TreeMap;

public class CollectionTreeMapProgram {
	public static void main(String[] args) {
		// Creating TreeMap of the Even Numbers
		TreeMap<String, Integer> evenNum = new TreeMap<>();
		
		//Using put()
		evenNum.put("Two", 2);
		evenNum.put("Four", 4);
		
		//Using putIfAbsent()
		evenNum.putIfAbsent("Six", 6);
		System.out.println("TreeMap of the Even Number :- " + evenNum);
		
		
		//Creating TreeMap of the Numbers
		TreeMap<String, Integer> nuks = new TreeMap<>();
		nuks.put("One ", 1);
		
		//Using putAll()
		nuks.putAll(evenNum);
		System.out.println("TreeMap of the Number : "+nuks);
	}
}
