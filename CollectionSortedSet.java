package com.java.Programs;

import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSortedSet {
		public static void main(String[] args) {
			//Creating SortedSet using the TreeSet
			SortedSet<Integer> digit  = new TreeSet<>();
			
			//Insert Elements to the Set 
			digit.add(1);
			digit.add(2);
			digit.add(3);
			digit.add(4);
			System.out.println("Sorted Set :- "+digit);
			
			//Access the Element 
			int firstNumber = digit.first();
			System.out.println("First Number :- "+firstNumber);

			int lastNumber = digit.last();
			System.out.println("Last Number :- "+lastNumber);
			
			
			// Remove Elements
			boolean results = digit.remove(3);
			System.out.println("Is the number is removed :- "+results);
			
		}

}
