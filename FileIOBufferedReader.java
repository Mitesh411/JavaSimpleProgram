package FileIOStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileIOBufferedReader {
	public static void main(String[] args) {
		
		//Creates an array of Character 
		char[] array = new char[100];
		try {
			//Creates a FileReader
			FileReader file = new FileReader("file.txt");
			
			//Creates a Buffered Reader
			BufferedReader reads = new BufferedReader(file);
			
			//Read Characters
			reads.read(array);
			System.out.println("Data in the File :-");
			System.out.println(array);
			
			//Close the Reader
			reads.close();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
