package com.java.Program;

class CPU {
	double price;

	// Nested Class
	class Processor {

		// member of nested class
		double cores;
		String manufacture;

		double getCache() {
			return 4.3;

		}

	}

	// nested Protected Class
	protected class RAM {
		// members of protected nested class

		double memory;
		String manufacturer;

		double getClockSpeed() {
			return 5.5;

		}
	}

}

public class NestedInnerClass {
	public static  void main(String[] args) {
		// Create Object of Outer Class
		CPU cpuobj = new CPU();
		
		// Create an Object of Inner Class Processor using Outer Class
		CPU.Processor processor =  cpuobj.new Processor();
		
		// Create an Object of inner Class RAM using Outer class CPU
		CPU.RAM ram = cpuobj.new RAM();
		System.out.println("Processor Cache " +processor.getCache());
		System.out.println("Ram Clock Speed " +ram.getClockSpeed());
		
	
	
	}

}
