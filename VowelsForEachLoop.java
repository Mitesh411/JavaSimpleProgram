package com.java.Program;

public class VowelsForEachLoop {
	public static void main(String[] args) {
		
		char[] vowels = {'a','e','i','o','u'};
		
		//iterating through an array using a loop
		for (int i=0;i<vowels.length;++i) {
			System.out.println(vowels[i]);
		}
		
		
		
		//iterating through an array using the for-each loop
		for(char printchar : vowels) {
			System.out.println("\n "+printchar);
		}
	}
}
