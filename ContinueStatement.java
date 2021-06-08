package com.java.Program;

public class ContinueStatement {
	public static void main(String[] args) {
		// for loop
		for(int i=1; i<=15;i++) {
			
			// if the value of i is between 4 to 9 
			//continue is executed
			
			if(i > 4 && i < 9) {
				continue;
			}
			System.out.println(i);
		}
	}
}
