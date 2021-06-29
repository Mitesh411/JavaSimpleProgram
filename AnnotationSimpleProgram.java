package com.java.Program;

import java.util.ArrayList;

//@suppressWarnings Annotation Example


public class AnnotationSimpleProgram {
	@SuppressWarnings("unchecked")
	static void wordList() {
		ArrayList wordList = new ArrayList<>();
		
		// This causes an unchecked warning
		wordList.add("programiz");
		System.out.println("Word List => "+wordList);
	}
	
	public static void main(String[] args) {
		wordList();
	}
}
