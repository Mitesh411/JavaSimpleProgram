package com.java.Program;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDequeue {
	public static void main(String[] args) {
		//Creating Dequeue using the ArrayDequeue Class
		Deque<Integer> dq = new ArrayDeque<>();
		
		//add elements of the Dequeue
		dq.offer(1);
		dq.offerLast(2);
		dq.offerFirst(3);
		System.out.println("Dequeue :- "+dq);
		
		//Access the First elements of Dequeue
		int fisele = dq.peekFirst();
		System.out.println("First Element :- "+fisele);
	
		// Access the Last Element of Dequeue
		int lsele = dq.peekLast();
		System.out.println("Last Element :- "+lsele);
		
		// Remove the Element from the Dequeue
		int rmele = dq.pollFirst();
		System.out.println("Removed First Element :- "+rmele);
		
		int rmlst = dq.pollLast();
		System.out.println("Removed Last Element :- "+ rmlst);
		
		System.out.println("Updated Dequeue :- "+dq);
	}
}
