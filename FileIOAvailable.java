package FileIOStream;

import java.io.FileInputStream;

public class FileIOAvailable {
	public static void main(String[] args) {
		try {
			// Suppose, the input.txt file contains the following text 
			// This is a Line of Text inside the File
			FileInputStream inputs = new FileInputStream("D:input.txt");
			
			//  Return the number of available type 
			System.out.println("Available bytes at the Beginning  "+inputs.available());
			
			//Read 3 bytes from the file
			inputs.read();
			inputs.read();
			inputs.read();
			
			//Return the numbers of available Types
			System.out.println("Available bytes at the end "+ inputs.available());
			inputs.close();
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
