package com.java.Program;

interface Octo{
	public void display();
}

class AnonymousInterfacedemo{
	public void crclass(){
		//anonymous class implementing interface
		Octo oc = new Octo() {
					
			public void display() {
				// TODO Auto-generated method stub
			System.out.println("Inside an anonymous class");
			}
		};
		oc.display();
	}
}


public class AnonymousInterface {
	public static void main(String[] args) {
		AnonymousInterfacedemo aid = new AnonymousInterfacedemo();
		aid.crclass();
	}
}
