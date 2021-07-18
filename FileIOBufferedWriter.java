package FileIOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIOBufferedWriter {
	public static void main(String[] args) {
		String data = "This is the data in the output file";
		
		try {
			//Creates a File Writer 
			FileWriter file = new FileWriter("file.txt");
			
			//Creates a Buffered Writer 
			BufferedWriter output = new BufferedWriter(file);
			
			//Writes a String to the file 
			output.write(data);
			
			//Flushes the data to the destination
			output.flush();
			System.out.println("Data is Flushed into the File ");
			
			//Close the writer
			output.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
