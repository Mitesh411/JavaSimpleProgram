package com.java.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgoMinMax {
	public static void main(String[] args) {
		//Creating an Array List
		ArrayList<Integer> algominmax = new ArrayList<>();
		algominmax.add(1);
		algominmax.add(2);
		algominmax.add(3);
		
		//Using min()
		int min = Collections.min(algominmax);
		System.out.println("Minimum Element :- "+min);
		
		//Using max()
		int max  = Collections.max(algominmax);
		System.out.println("Maximum Element :- "+max);
		
	}
}
