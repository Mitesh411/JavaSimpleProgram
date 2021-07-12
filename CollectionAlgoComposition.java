package com.java.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgoComposition {
	public static void main(String[] args) {
		//Creating an ArrayList 
		ArrayList<Integer> arrcomp = new ArrayList<>();
		arrcomp.add(1);
		arrcomp.add(2);
		arrcomp.add(3);
		arrcomp.add(4);
		System.out.println("Array List One :- "+arrcomp);
		
		int count = Collections.frequency(arrcomp, 2);
		System.out.println("Count of 2 :- "+count);
		
		ArrayList<Integer> newarrcomp = new ArrayList<>();
		newarrcomp.add(5);
		newarrcomp.add(6);
		System.out.println("Array List 2 :-"+newarrcomp);
		
		boolean value = Collections.disjoint(arrcomp,newarrcomp);
		System.out.println("Two List ar Disjoints:- "+value);
		
				
		
		
	}
}
