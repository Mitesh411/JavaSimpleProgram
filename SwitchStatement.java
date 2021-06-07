package com.java.Program;

public class SwitchStatement {
	public static void main(String[] args) {
		int number = 29;
		String size;
		
		// Check Statement to check Size
		switch(number) {
		
		case 29:
		size = "Small";
		break;
		
		case 42:
		size = "Medium";
		break;
		//match the Value of Week
		
		case 44:
		size = "Large";
		break;

		case 48:
		size = "Extra Large";
		break;
		
		default:
		size = "Unknown";
		break;
		}
		System.out.println("Selected Size is :-"+size);
	}
	
}
