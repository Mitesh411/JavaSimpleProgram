package com.java.Programs;

import java.util.WeakHashMap;

public class CollectionWeakHashMap {
	public static void main(String[] args) {
		//Creating WeakHashMap of Numbers
		WeakHashMap<String, Integer> hwk = new WeakHashMap<>();
		
		String two = new String("Two");
		Integer twoValue = 2;
		String four = new String("Four");
		Integer fourValue = 4;
		
		//Inserting Element
		hwk.put(two, twoValue);
		hwk.put(four, fourValue);
		System.out.println("WeakHashMap:- "+hwk);
		
		//Make the Reference null
		two = null;
		
		//Perform the Garbage Collection
		System.gc();
		
		System.out.println("Wak Hash Map After Garbage Collection :- "+hwk);
		
		
		
	}

}
