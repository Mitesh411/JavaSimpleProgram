package com.java.Programs;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAlgoShuffle {
		public static void main(String[] args) {
			//Creating an Array List
			ArrayList<Integer> arr = new ArrayList<>();
			
			//Add Elements
			arr.add(1);
			arr.add(2);
			arr.add(3);
			arr.add(4);
			System.out.println("Sorted Array List Number :- "+arr);
			
			//Using Shuffle Method
			Collections.shuffle(arr);
			System.out.println("Array List using Shuffle :- "+arr);
			
			
		}
}
