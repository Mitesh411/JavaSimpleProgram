package com.java.Program;

class India{
	public void displayInfos() {
		System.out.println("India is a Goood Country");
	}
}

class Gujarat extends India{
	@Override
	public void displayInfos() {
		System.out.println("Gujarat is a State ");
	}
}


public class PolymorphismOverriding {
	public static void main(String[] args) {
		// Create Object of an India Class
		India obj1 = new India();
		obj1.displayInfos();
		
		// Create Object of Gujarat Class
		Gujarat obj2 = new Gujarat();
		obj2.displayInfos();
	
	
	}
}
