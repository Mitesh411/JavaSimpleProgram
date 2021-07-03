package com.java.Program;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionPriorityQueueComparator {
	public static void main(String[] args) {

		// creating a Priority Queue
		PriorityQueue<Integer> pcs = new PriorityQueue<>();
		pcs.add(4);
		pcs.add(2);
		pcs.add(1);
		pcs.add(3);
		System.out.println("Priority Queue Element " + pcs);

	}
}

class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int value = o1.compareTo(o2);

		// elements are sorted in reverse order
		if (value > 0) {
			return -1;
		} else if (value < 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
