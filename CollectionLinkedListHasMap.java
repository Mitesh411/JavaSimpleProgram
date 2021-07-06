package com.java.Programs;

import java.util.LinkedHashMap;

public class CollectionLinkedListHasMap {
	public static void main(String[] args) {
		//Creating a LinkedHashMap of even numbers
		LinkedHashMap<String , Integer> even = new LinkedHashMap<>();
		even.put("Two", 2);
		even.put("Four", 4);
		System.out.println("LinkedHashMap 1 :- "+even);
		
		
		
		
		//Creating a LinkedHashMap from other LinkedHashMap
		LinkedHashMap<String, Integer> nu = new LinkedHashMap<>(even);
		nu.put("Three", 3);
		System.out.println("LinkedHashMap 2"+ nu);
	}
	
	

}
