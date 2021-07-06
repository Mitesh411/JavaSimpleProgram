package com.java.Programs;

import java.util.HashMap;
import java.util.TreeMap;

public class CollectionTreeMaptoHashMap {
		public static void main(String[] args) {
			// Create  a TreeMap
			TreeMap<String, Integer> evenNumber = new TreeMap<>();
			evenNumber.put("Two", 2);
			evenNumber.put("Four", 4);
			System.out.println("TreeMap :- "+evenNumber);
			
			//Create HashMap from TreeMap
			HashMap<String, Integer> nums = new HashMap<>(evenNumber);
			nums.put("Three", 3);
			System.out.println("HashMap :- "+ nums);
			
			
			
		}
}
