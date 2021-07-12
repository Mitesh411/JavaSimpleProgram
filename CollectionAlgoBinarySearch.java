package com.java.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgoBinarySearch {
	public static void main(String[] args) {
		//Creating Array List 
		ArrayList<Integer> arrbs = new ArrayList<>();
		arrbs.add(1);
		arrbs.add(2);
		arrbs.add(3);
		
		//Using Binary Search()
		int pos = Collections.binarySearch(arrbs, 3);
		System.out.println("The Position of 3 is :- "+pos);
		
		
		
	}
}
