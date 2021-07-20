package additionalTopic;

import java.io.FileWriter;

public class FileReaderOut {
	public static void main(String[] args) {
		String data= "This is the data in output File";
		try {
			//Creates a Writer using File Writer
			FileWriter output = new FileWriter("file2.txt");
			
			// Writes String to a File
			output.write(data);
			System.out.println("Data is written to the File");
			
			//Close the Writer
			output.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}	
