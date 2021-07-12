package com.java.Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectioAlgoIterator {
	public static void main(String[] args ) {
		//Creating an ArrayList
		ArrayList<Integer> arritr = new ArrayList<>();
		arritr.add(1);
		arritr.add(3);
		arritr.add(2);
		System.out.println("Array List:- "+arritr);
		
		//Creating an instance of Iterator 
		Iterator<Integer> iterate = arritr.iterator();
		
		//Using the next() method 
		int nxt = iterate.next();
		System.out.println("Accessed Element :- "+nxt);
		
		//Using  the remove method 
		iterate.remove();
		System.out.println("Removed Element:- "+nxt);
		
		System.out.println("Updated Array List ");
		
		
		//Using the HasNext() method
		while (iterate.hasNext()) {
			//Using the forEachRemaining () method
			iterate.forEachRemaining((value)-> System.out.print(value+","));
			
		}
	}
}
