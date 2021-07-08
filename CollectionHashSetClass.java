package com.java.Programs;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashSetClass {
		public static void main(String[] args) {
			// Creating a Set using the HashSet Class
			Set<Integer> set1 = new HashSet<>();
			
			// Add element to Set1
			set1.add(2);
			set1.add(3);
			System.out.println("Element of Set1 :- "+set1);
			
			
			
			//Creating another set using the HashSet Class
			Set<Integer> set2 = new HashSet<>();
			
			//Add Element 
			set2.add(1);
			set2.add(2);
			System.out.println("Element of Set2 :-"+set2);
			
			//Union of two Sets
			set2.addAll(set1);
			System.out.println("Union is :- "+set2);
			
		}

}
