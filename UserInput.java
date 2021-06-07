package com.java.Program;
import java.util.Scanner;

public class UserInput {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Getting Integer Input 
		System.out.println("\n Enter an Integer :- ");
		int number = input.nextInt();
		System.out.println("\n You Entered "+number);
		
		
		// Getting Float Input
		System.out.println("\n Enter the Float Value:- ");
		float fl = input.nextFloat();
		System.out.println("\n You Entered the Float Value "+fl);
		
		
		// Getting the Double Value
		System.out.println("\n Enter the Double Value :- ");
		Double dbinput  = input.nextDouble();
		System.out.println("\n You have Double Value "+dbinput);
		
		
		// Getting String Value 
		System.out.println("\n Enter Text :- ");
		String strInput = input.next();
		System.out.println("\n You have Entered String "+strInput);
		
		//Closing the Scanner Object
		input.close();
		
	}

}
