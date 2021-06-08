package com.java.Program;

public class LabelBreakStatement {
	public static void main(String[] args) {
		// the for loop is labeled as first
		first: 
			for (int i = 1; i <= 5; i++) {

			// the For loop is labeled as Second
			second: 
				for (int j = 1; j < 3; j++) {
				System.out.println("i =" + i + " j= " + j);

				// the break statement break the first for loop
				if (i == 2)
					break;
			}
		}
	}
}
