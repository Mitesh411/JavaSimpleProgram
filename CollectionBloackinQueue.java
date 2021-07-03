package com.java.Program;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionBloackinQueue {
	public static void main(String[] args) {
		// Create a blocking queue using the ArrayBlockingQueue
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
		
		try {
			//Insert the Element to Blocking queue
			bq.put(1);
			bq.put(3);
			bq.put(4);
			System.out.println("Blocking Queue" +bq);
			
			// Remove the Element from Blocking Queue
			int remeles= bq.take();
			System.out.println("Removed Number :- "+remeles);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
