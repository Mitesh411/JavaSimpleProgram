package com.java.Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {
	public static void main(String[] args) {
		//Creating ArrayList of Even Numbers
		ArrayList<Integer> evenNumber = new ArrayList<>();
		//Using Add Method 
		evenNumber.add(5);
		evenNumber.add(3);
		evenNumber.add(6);
		System.out.println("Array List :- "+evenNumber);
		
		//Creating a Linked Hash Set from Array List
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumber);
		//using addAll() Method 
		numbers.addAll(evenNumber);
		System.out.println("Linked Hash Set :-  "+numbers);
		
	
	}
}
