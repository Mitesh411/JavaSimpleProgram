package com.java.Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionThrows {
	// declaring the type of Exception
	public static void findFile() throws IOException{
		// Code that Generate the IOException
		File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		}
	
	public static void main(String[] args) {
		try {
			findFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
