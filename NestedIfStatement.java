package com.java.Program;

public class NestedIfStatement {
 public static void main (String[] args) {
	 // Declaring Double Type Variables
	 Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
	 
	 //Checks if n1 is greater than or equal to n2
	 if (n1 >= n2) {
		 
		 //If...else statement inside if block 
		 // Check if n1 is Greater than or equal to n3
		 
		 if(n1 >= n3) {
			 largest = n1;
			 
		 }
	 
		 else {
			 largest = n3;
		 } 
		 }
	 
		 else {
			 // if..else Statement inside else block
			 // checks if n2 is greater than or equal to n3
			 if(n2 >= n3) {
				 largest = n2;
				 
			 }
			 else {
				 largest = n3;
			 }
		 }
	 System.out.println("\n Largest Number among all Input :-"+ largest );
	 }
 }

