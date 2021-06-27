package com.java.Program;

enum Sizer{
	SMALL,LARGE, MEDIUM, EXTRALARGE
}

class Tester {
	Size pizzaSize;
	public Tester(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I Ordered a Small Size Pizza");
			break;
		case LARGE:
			System.out.println("I Ordered a Large Size Pizza");
			break;
		case MEDIUM:
			System.out.println("I Ordered a Medium Size Pizza");
			break;
		default:
			System.out.println("I dont know which one to Order ");
			break;
		}
	}
}


public class EnumSwitchCaseProgram {
	public static void main(String[] args) {
		Tester objtest = new Tester(Size.EXTRALARGE);
		objtest.orderPizza();
	}
}
