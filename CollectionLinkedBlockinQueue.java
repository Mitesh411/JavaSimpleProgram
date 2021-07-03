package com.java.Program;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class CollectionLinkedBlockinQueue {
	public static void  main(String[] args) {
		LinkedBlockingQueue<String> anikal = new LinkedBlockingQueue<>();
		
		//Using add()
		anikal.add("Dog");
		anikal.add("Cat");
		
		//Using Offer
		anikal.offer("Horse");
		System.out.println("LinkedBlockingQueue: - "+anikal);
		
		// Using peek()
		String anipeek = anikal.peek();
		System.out.println("Accessed Element :- "+anipeek);
		
		 // Using iterator()
        Iterator<String> iterate = anikal.iterator();
        System.out.print("LinkedBlockingQueue Elements: ");

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }

}