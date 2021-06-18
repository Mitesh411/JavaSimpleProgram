package com.java.Program;



class Aquatic{
	protected String type = "animal";
}

class Whale extends Aquatic{
	public String type = "mammal";
	public void printType() {
		System.out.println(" I am a " + type);
		System.out.println(" I am a " + super.type);
	}
}

public class SuperClassSuperAttributes {
	public static void main(String[] args) {
		Whale obj = new Whale();
		obj.printType();
	}
}
