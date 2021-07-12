package com.java.Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectioAlgoSort {
	public static void main(String[] args) {
		//Creating an Array List
		ArrayList<Integer> digi = new ArrayList<>();
		
		//Add Element 
		digi.add(10);
		digi.add(2);
		digi.add(3);
		digi.add(1);
		digi.add(4);
		System.out.println("UnSorted ArrayList :- "+digi);
	
		//Using the sort() method
		Collections.sort(digi);
		System.out.println("Sorted Array List :- "+digi);
	
	}
}
