package com.java.Program;

public class AccessClassObjectProgram2 {
	// Store the Value for Light
	// true if Light is On
	// False if Light is Off
	boolean isOn;

	// method to turn on Light
	void turnon() {
		isOn = true;
		System.out.println("Light gets Turn On " + isOn);
	}

	void turnoff() {
		isOn = false;
		System.out.println("Lights gets Turnoff " + isOn);
	}

	public static void main(String[] args) {
		AccessClassObjectProgram2 Led = new AccessClassObjectProgram2();
		AccessClassObjectProgram2 halogen = new AccessClassObjectProgram2();
		Led.turnon();
		halogen.turnoff();

	}

}
