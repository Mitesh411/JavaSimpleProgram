package com.java.Programs;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSer {
	public static void main (String[] args) {
		TreeSet<Integer> trsetnum = new TreeSet<>();
		
		//Using the add() method
		trsetnum.add(1);
		trsetnum.add(2);
		trsetnum.add(4);
		System.out.println("Tree Set :- "+trsetnum);
		
		
		TreeSet<Integer> numbs = new TreeSet<>();
		numbs.add(5);
		
		//Using the Addall() method 
		numbs.addAll(trsetnum);
		System.out.println("Updated and New TreeSet :- "+numbs);
		
		
		//Calling Iterator Method 
		Iterator<Integer> iterate = numbs.iterator();
		System.out.println("TreeSet Using Iterator - ");
		//Accessing Elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
			
		}
		
		//Using Remove Method 
		boolean rm1 = numbs.remove(4);
		System.out.println("Is 4th Element is removed :- "+rm1);
		
		//Using the removeAll() method
		boolean value2 = numbs.removeAll(numbs);
		System.out.println("Are All Elements Removed :- "+value2);
		
		System.out.println("Print all Element in Array :- " +numbs);
		
		
	}

}
