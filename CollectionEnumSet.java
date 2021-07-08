package com.java.Programs;

import java.util.EnumSet;

public class CollectionEnumSet {
	//an enum named Size
	enum Size{
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	public static void main(String[] args) {
		
		//Creating an EnumSet using allof()
		EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		System.out.println("EnumSet :- "+ sizes);
	}
}
