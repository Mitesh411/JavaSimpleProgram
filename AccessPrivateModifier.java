package com.java.Program;

 class Data {
	// private variable 
	private String name;
	
	//Getter Method
	public String getName() {
		return this.name;
	}
	
	
	//Setter Method
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
}	
public class AccessPrivateModifier {
	public static void main(String[] main) {
		// create an Object
		Data obj = new Data();
		// access the Private Variable using the getter and setter method 
		 obj.setName("Hello World");
		 System.out.println("\t Name is :- " + obj.getName());
		
		
	}

	
}
