package com.java.Program;

public class SimpleThisProgran {
	int instvar;
	
	public SimpleThisProgran(int instVar) {
		// TODO Auto-generated constructor stub
		this.instvar = instVar;
		System.out.println("this reference = " + this);
		}
	
	public static void main(String[] args) {
		SimpleThisProgran obj = new SimpleThisProgran(8);
		System.out.println("Object Reference " +obj );
	}
	
}
