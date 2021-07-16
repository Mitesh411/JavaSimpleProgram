package FileIOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileIOBufferedOutputStream {
	public static void main(String[] args) {
		String data = "This is a Line of text inside the File";
		
		try {
			//Create a FileOutputStream
			FileOutputStream file = new FileOutputStream("file1.txt");
			
			//Create a Buffered Output stream 
			BufferedOutputStream output = new BufferedOutputStream(file);
			
			byte[] array  = data.getBytes();
			//Flushes data to the Destination
			output.flush();
			System.out.println("Data Flushed to the File");
			
			//Write data to the Output Stream
			output.write(array);
			output.close();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			
		}
		
	}
}
