package com.java.Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionAlgoListIterator {
	public static void main(String[] args) {
		//Creating an Array List 
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(3);
		li.add(2);
		System.out.println(" Array List :- "+li);
		
		
		// Creating an instance of ListIterator
		ListIterator<Integer> iterate = li.listIterator();
		
		//Using the next() method 
		int nums1 = iterate.next();
		System.out.println("Next Element :- "+nums1);
		
		
		//Using the nextIndex() 
		int nx1 = iterate.nextIndex();
		System.out.println("Position of Next Element :- "+nx1);
		
		//Using the hashNext() method
		System.out.println("Is any Next Element ? "+iterate.hasNext());
		
		
	}

}
