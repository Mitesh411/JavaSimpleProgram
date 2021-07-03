package com.java.Program;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionPriorityQueueIterating {
	public static void main(String[] args) {
		//Creating a Priority Queue
		PriorityQueue<Integer> pqi = new PriorityQueue<>();
		pqi.add(1);
		pqi.add(5);
		pqi.add(4);
		pqi.add(8);
		System.out.println("Priority Queue using Iterator()");
		
		//Using the Iterator() method 
		Iterator<Integer> iterates = pqi.iterator();
		while (iterates.hasNext()) {
			System.out.println(iterates.next());
			System.out.println(",");
			
		}
		
		
	}
}
