package com.java.Program;

public class SimpleConstructor {
	private String name;
	
	// Constructor
	 public SimpleConstructor() {
		// TODO Auto-generated constructor stub

		 System.out.println("\t Constructor Called");
		 name = "Constructor Demo";
	 }
	
	 
	 
	 public static void main(String[] args) {
		 //Constructor is invoked while 
		 // Creating an Object of Main class
		 SimpleConstructor obj = new SimpleConstructor();
		 System.out.println("\t The Name is :- "+obj.name);
	 }
}
