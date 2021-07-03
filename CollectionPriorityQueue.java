package com.java.Program;

import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionPriorityQueue {
	public static void main(String[] args) {
		//Creating Queue using the Priority Class Queue
		Queue<Integer> numbss = new PriorityQueue<>();
		
		
		//Offer Elements to the Queue
		numbss.add(5);
		numbss.add(1);
		numbss.add(4);
		numbss.add(7);
		System.out.println("Queue:- "+numbss);
		
		// Access Element of the Queue
		int acssnums = numbss.peek();
		System.out.println("Access Element "+acssnums);
		
		//Remove Element of the Queue
		int removesElement = numbss.poll();
		System.out.println("Removed Element :- " +removesElement );
		
		System.out.println("Updated Queue "+numbss);
	}

}
