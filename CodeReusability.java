package com.java.Program;

public class CodeReusability {
		// Method Defined 
		private static  int getSquare(int x) {
			return x * x;
			
		}
		public static void main(String[] args) {
			for (int i = 0; i <= 5; i++) {
				// Method call
				int result = getSquare(i);
				System.out.println("Square of "+i+ " is :"+result);
				
			}
		}
	}
