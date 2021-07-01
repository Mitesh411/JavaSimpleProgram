package com.java.Program;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionArrayToArrayList {
	public static void main (String[] args) {
		// Create an array of String Type
		String[] ary = {"Java", "Python", "C++"};
		System.out.println("Array :" );
		
		// Print Array 
		for (String str : ary) {
			System.out.println(str);
			System.out.println(" ");
			
		}
		
		// Create an Array List  from Array
		ArrayList<String> aryl = new ArrayList<>(Arrays.asList(ary));
		System.out.println("\n ArrayList : "+aryl );
	}
}
