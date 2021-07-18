package FileIOStream;

import java.io.StringWriter;

public class FileIOStringWriter {
	public static void main(String[] args) {
		String data = "This is the Updated String in the String";
		
		try {
			//Creates a StringWriter with default String Buffer Capacity
			StringWriter output = new StringWriter();
			
			//Writes data to the String buffer 
			output.write(data);
			
			//Prints the StringWriter 
			System.out.println("Data in the String Writer :- "+output);
			
			output.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			
		}
		
	}
}
