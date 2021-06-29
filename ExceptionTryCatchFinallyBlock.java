package com.java.Program;
import java.io.*;

class ListOfNumbers{
	// create an integer array 
	private int[] list = {5, 6, 8, 9, 2};
	
	//method to write data from array to a file
	public void writeList() {
		PrintWriter out = null;
		try {
			System.out.println("Entering Try statement");
			// Creating  a new File OutputFile.txt
			out = new PrintWriter(new FileWriter("OutputFile.txt"));
			
			//writing values from List array to Output.txt
			for (int i = 0; i < 7; i++) {
				System.out.println("Value at : "+ i + " = " +list[i]);
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception => "+ e.getMessage());
		}finally {
			// Checking if PrintWriter has been Opened 
			if (out!=null) {
				System.out.println("Closing PrintWriter");
				// Close PrintWriter
				out.close();
			}else {
				System.out.println("PrintWriter not open");
			}
		}
		
	}


}


public class ExceptionTryCatchFinallyBlock {
	public static void main(String[] args) {
		ListOfNumbers listing = new ListOfNumbers();
		listing.writeList();
		
	}
}
