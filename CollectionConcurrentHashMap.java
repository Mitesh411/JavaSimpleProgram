package com.java.Programs;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionConcurrentHashMap {
	public static void main(String[] args) {
		//Creating a HashMap of even number
		HashMap<String, Integer> evenNum = new HashMap<>();
		evenNum.put("Two", 2);
		evenNum.put("Four", 4);
		System.out.println("Hash Map :- "+evenNum);
		
		//Creating  a Concurrent HashMap from Other Map
		ConcurrentHashMap<String, Integer> numbers = new ConcurrentHashMap<>(evenNum);
		evenNum.put("Three", 3);
		System.out.println("Concurrent Hash Map :- "+evenNum);
		
	}
}
