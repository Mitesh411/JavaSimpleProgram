package com.java.Programs;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {
		public static void main(String[] args) {
			//Defining Hash Set
			HashSet<Integer> evenNumber = new HashSet<>();
			// Using add() method 
			evenNumber.add(2);
			evenNumber.add(4);
			evenNumber.add(6);
			System.out.println("Hash Set:-  "+evenNumber);
			
			HashSet<Integer> nus = new HashSet<>();
			//using Addall() method 
			nus.addAll(evenNumber);
			nus.add(5);
			System.out.println("New HashSet :- "+nus);
			
			//Calling Iterator() method 
			Iterator<Integer> iterate = nus.iterator();
			System.out.println("Hash Set Using Iterator ");
			//Accessing Element 
			while (iterate.hasNext()) {
				System.out.print(iterate.next());
				System.out.print(",");
				
			}
		}

}
