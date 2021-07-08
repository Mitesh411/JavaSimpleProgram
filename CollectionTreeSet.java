package com.java.Programs;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet {
		public static void main(String[] args) {
			//Creating a set using the TreeSet class
			Set<Integer> setnums = new TreeSet<>();
			// Add Element to the Set 
			setnums.add(2);
			setnums.add(3);
			setnums.add(1);
			System.out.println("Set using TreeSet :- "+setnums);
			
			//Access Elements using Iterator()
			System.out.println("Accessing Elements using Iterator(): ");
			Iterator<Integer> iterate = setnums.iterator();
			while (iterate.hasNext()) {
				System.out.println(iterate.next());
				System.out.println(", ");
			}
			
			
		}
}
