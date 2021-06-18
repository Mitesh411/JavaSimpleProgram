package com.java.Program;


class Animalis {

	  // default or no-arg constructor
	  Animalis() {
	    System.out.println("I am an animal");
	  }

	  // parameterized constructor
	  Animalis(String type) {
	    System.out.println("Type: "+type);
	  }
	}

	class Dogest extends Animalis {

	  // default constructor
	  Dogest() {

	    // calling parameterized constructor of the superclass
	    super("Animal");

	    System.out.println("I am a dog");
	  }
	}


public class SuperClassParameterizedConstructor {
	public static void main(String[] args) {
		 Dogest dog1 = new Dogest();
	}
	
}
