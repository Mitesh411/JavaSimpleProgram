package com.java.Program;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionArrayBlockingQueue {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(5);
		
		//Using add()
		abq.add(1);
		abq.add(5);
		abq.add(3);
		
		// Using Offer 
		abq.offer(2);
		System.out.println("Array Blocking Queue :- "+abq);
		
		// Using peek()
		Integer peele = abq.peek();
		System.out.println("Accessed Element :-" +peele);
		
		
		// Using Iterator 
		Iterator<Integer> iterate = abq.iterator();
		System.out.println("Array Blocking Queue Elements :");
		
		while (iterate.hasNext()) {
			System.out.println(iterate.hasNext());
			System.out.println(",");
			
		}
		
	}
}
