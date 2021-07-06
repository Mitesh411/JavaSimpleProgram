package com.java.Programs;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CollectionConcurrentMap {
	public static void main(String[] args) {
		//Creating Concurrent Map using Concurrent Hash Map
		ConcurrentMap<String, Integer> connum = new ConcurrentHashMap<>();
		
		//Insert Element to map
		connum.put("Two", 2);
		connum.put("One", 1);
		connum.put("Three", 3);
		System.out.println("Concurrent Map:- "+connum);
		
		//Access the Value of Specified Key
		int value = connum.get("One");
		System.out.println("Accessed Value :- "+value);
		
		//Remove the Value of Specified Key 
		int removedValue = connum.remove("One");
		System.out.println("Removed Value :- " + removedValue);
		
	}
}
