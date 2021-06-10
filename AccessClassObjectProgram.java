package com.java.Program;


class Lamp {
	// Stores the value of Light
	// true if Light is On
	// False if Light is OFF
	
	boolean isOn;
	
	// method to Turn on Light
	void turnon() {
		isOn = true;
		System.out.println("Light is On ? "+isOn);
		}
	
	// method to turnoff the Light
	void turnOff() {
		isOn = false;
		System.out.println("Light is On ? "+isOn);
	}
}




public class AccessClassObjectProgram {
	public static void main(String[] args) {
		// Create Objects Led and Halogen
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		
		// turn on the Light by
		// Calling method turnOn()
		led.turnon();
		
		// turn Off the Light by
		// Calling method turnOff
		halogen.turnOff();
		
	}
	
	}