package com.java.Program;
enum das{
	SMALL{
		//overriding toString() for SMALL
		public String toString() {
			return "The Size is small";
		}
	},
	
	MEDIUM{
		//Overriding toString() for Medium
		public String toString() {
			return "The Size is Medium";
		}
	};
}

public class EnumDefaultString {
	public static void main(String[] args) {
		System.out.println(das.MEDIUM.toString());
	}
}
