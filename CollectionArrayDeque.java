package com.java.Program;

import java.util.ArrayDeque;

public class CollectionArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<>();
		
		// Using add()
		adq.add("Dog");
		
		//Using addFirst()
		adq.addFirst("Elephant");
		
		//Using addLast()
		adq.addLast("Cow");
		System.out.println("Array Deque :- "+adq);
		
		//Using Offer()
		adq.offer("Ostrich");
		
		//Using offerFirst()
		adq.offerFirst("Snake");
		
		//Using offerLast()
		adq.offerLast("Horse");
		System.out.println("Array Deque with Offer MEthod "+adq);
		
		// Get the First Element 
		String fis = adq.getFirst();
		System.out.println("Get the First Element :- "+fis);
		
		// Get the Last Element 
		String las = adq.getLast();
		System.out.println("Get the Last Element :- "+las);
	}

}
