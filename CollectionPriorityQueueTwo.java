package com.java.Program;

import java.util.PriorityQueue;

public class CollectionPriorityQueueTwo {
	public static void main(String[] args) {
		
		// Creating a Priority Queue
		PriorityQueue<Integer> pyq = new PriorityQueue<>();
		
		// using the add() method
		pyq.add(4);
		pyq.add(2);
		pyq.add(8);
		System.out.println("Priority Queue:- "+ pyq);
		
		//Using the Offer Method
		pyq.offer(10);
		System.out.println("Updated Priority Queue:- "+pyq);
		
		//Using the peek() method
		int pyqs = pyq.peek();
		System.out.println("Accessed Element:- "+pyqs);
		
		// Using the remove() method
		boolean result = pyq.remove(2);
		System.out.println("Is the element 2 is removed ? "+ result);

		
		// Using the poll() method 
		int po = pyq.poll();
		System.out.println("Remove Element using poll() "+po);
		
		System.out.println("Priority Queue:- "+ pyq);
	}
}
