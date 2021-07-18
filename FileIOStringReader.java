package FileIOStream;

import java.io.StringReader;

public class FileIOStringReader {
	public static void main(String[] args) {
		String data = "This is the Text read from the String Reader";
		
		//Create a Character array 
		char[] array = new char[100];
		
		try {
			//Creates a String Reader 
			StringReader input = new StringReader(data);
			
			//Use the read method 
			input.read(array);
			System.out.println("Data read from the String");
			System.out.println(array);
			
			input.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		
	}
}
