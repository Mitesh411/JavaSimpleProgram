package FileIOStream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileIOFileInputStream {
	public static void main(String[] args) {
		//Creates an array of character 
		char[] array = new char [100];
		
		try {
			//Creates a File Input Stream 
			FileInputStream files = new FileInputStream("input.txt");
			
			//Creates an InputStreamReader 
			InputStreamReader input = new InputStreamReader(files);
			
			//Reads character from File 
			input.read(array);
			System.out.println("Data in the Stream");
			System.out.println(array);
			
			//Close the reader
			input.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		
		
	}
}
