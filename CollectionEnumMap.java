package com.java.Programs;

import java.util.EnumMap;

public class CollectionEnumMap {
	enum Sizes{
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	public static void main(String[] args) {
		//Creating an Enum Map of the Size enum
		EnumMap<Sizes, Integer> sizes1 = new EnumMap<>(Sizes.class);
		
		//Using the Put Method 
		sizes1.put(Sizes.SMALL, 28);
		sizes1.put(Sizes.MEDIUM, 32);
		System.out.println("EnumMap1:- " +sizes1);
		
		
		EnumMap<Sizes, Integer> size2 = new EnumMap<>(Sizes.class);
		
		//Using putAll() method 
		size2.putAll(sizes1);
		size2.put(Sizes.LARGE, 36);
		System.out.println("EnumMap2" + size2);
		
		
		//Using the EntrySet() Method 
		System.out.println("Key Value Mapping:- " + sizes1.entrySet());
		
		//Using the keySet() Method
		System.out.println("Key Value Mapping:- " + sizes1.keySet());
		
		//Using the Values() Method
		System.out.println("Key Value Mapping:- " + sizes1.values());
		
	}

}
