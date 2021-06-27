package com.java.Program;

enum Sizers {

	   // enum constants calling the enum constructors 
	   SMALL("The size is small."),
	   MEDIUM("The size is medium."),
	   LARGE("The size is large."),
	   EXTRALARGE("The size is extra large.");

	   private final String pizzaSize;

	   // private enum constructor
	   private Sizers(String pizzaSize) {
	      this.pizzaSize = pizzaSize;
	   }

	   public String getSize() {
	      return pizzaSize;
	   }
	}

class  EnumConstructor {
	public static void main(String[] args) {
		   Sizers size = Sizers.EXTRALARGE;
		      System.out.println(size.getSize());

	}
}
