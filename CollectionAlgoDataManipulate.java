package com.java.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgoDataManipulate {
	public static void main(String[] args) {
		//Creating an ArrayList 
		ArrayList<Integer> arrint = new ArrayList<>();
		arrint.add(1);
		arrint.add(2);
		System.out.println("Array List One :- "+arrint);
		 
		//Using Reverse
		Collections.reverse(arrint);
		System.out.println("Reversed Array list :- "+arrint);
		
		//Using Swap()
		Collections.swap(arrint, 0, 1);
		System.out.println("Swaped Array List One :- "+arrint);
		
		ArrayList<Integer> newint = new ArrayList<>();
		
		//Using addAll()
		newint.addAll(arrint);
		System.out.println("ArrayList2 using addAll :- "+newint);
		
		//Using fill()
		Collections.fill(arrint, 0);
		System.out.println("Array List using Fill() "+arrint);
		
		//Using Copy
		Collections.copy(newint, arrint);
		System.out.println("Array List 2 Using Copy :- "+ newint);
		
		
	}
}
