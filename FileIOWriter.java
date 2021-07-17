package FileIOStream;

import java.io.FileWriter;
import java.io.Writer;

public class FileIOWriter {
	public static void main(String[] args) {
		String data = "This is the data in the output file";
		try {
			//Creates a writer using FileWriter 
			Writer output = new FileWriter("OutputFile.txt");
			
			//Writes String to the File 
			output.write(data);
			
			//Close the Writer
			output.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}
}
