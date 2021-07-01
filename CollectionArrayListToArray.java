package com.java.Program;

import java.util.ArrayList;

public class CollectionArrayListToArray {
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<>();
		
		// Add new Elements in array List 
		ar.add("Java");
		ar.add("Python");
		ar.add("PHP");
		ar.add("C");
		System.out.println("ArrayList: "+ar);
		
		//Create a new array of String Type 
		String[] arr = new String[ar.size()];
		
		
		// Convert ArrayList into a Array 
		ar.toArray(arr);
		System.out.println("Array: " );
		
		//access Element of the Array
		for (String item : arr) {
			System.out.println(item+ " , ");
		}
		
	}
}
