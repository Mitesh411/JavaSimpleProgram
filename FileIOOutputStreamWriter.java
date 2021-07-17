package FileIOStream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class FileIOOutputStreamWriter {
	public static void main(String[] args) {
		String data = "This is a Line text inside a file";
		
		try {
			//Creates a File Output Stream 
			FileOutputStream file = new FileOutputStream("OutputFile.txt");
			
			//Creates an Output Stream Writer 
			OutputStreamWriter output = new OutputStreamWriter(file);
			
			//Writes String to a File 
			output.write(data);
			
			//Closes the writer 
			output.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		
	}
}
