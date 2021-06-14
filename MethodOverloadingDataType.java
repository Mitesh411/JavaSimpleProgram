package com.java.Program;

public class MethodOverloadingDataType {

		// This method accept int 
	public static void display(int a) {
		System.out.println("\t Got an Integer Data");
	}
	
	public static void display(String a) {
		System.out.println("\t Got an String Value");
	}
	
	public static void main(String[] args) {
		MethodOverloadingDataType obj = new MethodOverloadingDataType();
		obj.display(5);
		obj.display("Hello World");
	}
}
