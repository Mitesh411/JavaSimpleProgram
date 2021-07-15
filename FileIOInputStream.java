package FileIOStream;

import java.io.FileInputStream;

public class FileIOInputStream {	
	public static void main (String[] args) {
		try {
			FileInputStream input = new FileInputStream("D:input.txt");
			System.out.println("Data in the File ");
			
			//Read the First Byte 
			int i= input.read();
			
			while (i != -1) {
				System.out.println((char)i);
				//Read the next byte from the file 
				i = input.read();
			}
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

}
