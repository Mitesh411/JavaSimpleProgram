package FileIOStream;

import java.io.FileReader;

public class FileIOFileReader {
	public static void main(String[] args) {
		//Creates an array of Character 
		char[] array = new char[100];
		
		try {
			//Creates  a reader using the FileReader 
			FileReader input = new FileReader("file.txt");
			
			//Reads Character
			input.read(array);
			System.out.println("Data in the File");
			System.out.println(array);
			
			//Close the Reader 
			input.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			
		}
		
	}
}
