package FileIOStream;

import java.io.FileWriter;

public class FileIOFileWriter {
	public static void main(String[] args) {
		String data = "This is the Data in the Output File";
		
		try {
			//Creates  a  File Writer 
			FileWriter output = new FileWriter("file.txt");
			
			//Writes to the String to the file 
			output.write(data);
			
			//Close the Writer
			output.close();
			
						
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}
}
