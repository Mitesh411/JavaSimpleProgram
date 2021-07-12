package com.java.Programs;

import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionNavigableSet {
	public static void main(String[] args) {
		//Creating NavigableSet Using the TreeSet
		NavigableSet<Integer> naviset = new TreeSet<>();
		
		//Insert Element to the set 
		naviset.add(1);
		naviset.add(2);
		naviset.add(3);
		System.out.println("Navigable Set :- "+naviset);
		
		//Access the First Element 
		int firstelement = naviset.first();
		System.out.println("First Number :- "+firstelement);
		
		//Access the Last Element 
		int lastelement = naviset.last();
		System.out.println("Last Element :- "+lastelement);
		
		//Remove the first element 
		int rmfirst = naviset.pollFirst();
		System.out.println("Remove the First Element :- "+rmfirst);
		
		// Remove the Last Element 
		int rmlast = naviset.pollLast();
		System.out.println("Remove the Last Element :- "+rmlast);
		
		
		
	}
}
