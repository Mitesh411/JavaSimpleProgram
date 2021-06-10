package com.java.Program;

public class ContinueNestedLoop {
	public static void main(String[] args) {
		int i=1, j=1;
		
		// Outer Loop 
		while(i<=3) {
			System.out.println("Outer Loop :- "+i);
		// Inner Loop
		while (j<=3) {
			if (j==2) {
				j++;
				continue;
			}
			System.out.println("\n Inner Loop: "+j);
			j++;
		}
		
		i++;
		}
		
	}
	
}
