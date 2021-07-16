package FileIOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileIOBufferedInputStream {
	public static void main(String[] args) {
		try {
			//Create an Input File Stream
			FileInputStream file = new FileInputStream("D:input.txt");
			
			//Creates a BufferedInputStream
			BufferedInputStream input = new BufferedInputStream(file);
			
			//Reads First byte from file
			int i = input.read();
			
			while (i != -1) {
				System.out.print((char)i);
				
				//Reads next byte from the file 
				i = input.read();
				
				
			}
			
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
