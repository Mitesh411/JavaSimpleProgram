package com.java.Program;

import java.util.LinkedList;
import java.util.Queue;

// Implementing the LinkedList Class

public class CollectionQueue {
	public static void main(String[] args) {
		// Creating Queue using the LinkedList Class
		Queue<Integer> numss = new LinkedList<>();
		
		// Offer the Elements to the Queue
		numss.add(1);
		numss.add(2);
		numss.add(3);
		System.out.println("Queue: " + numss);
		
		
		//  Access the Element of Queue
		int accnums = numss.peek();
		System.out.println("Access Elements: " + accnums);
		
		// Remove elements from the Queue
		int removedNumber = numss.poll();
		System.out.println("\n Removed Element: " +removedNumber);
		
		System.out.println("\n Updated Queue " +numss);
	}
}
