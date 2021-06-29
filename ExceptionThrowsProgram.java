package com.java.Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionThrowsProgram {
	public static void findfile() throws IOException{
		// Code that may Reproduce IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
	}

	public static void main(String[] args) {
		try {
			findfile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
