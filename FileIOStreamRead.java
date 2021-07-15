package FileIOStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileIOStreamRead {
	public static void main(String[] args) {
		byte[] array = new byte[100];
		try {
			
			InputStream input = new FileInputStream("D:input.txt");
			System.out.println("Available bytes in File :- "+input.available());
			
			//Read the bytes from input Stream
			input.read(array);
			System.out.println("Data read from File : ");
			
			//Convert byte array into String
			String data = new String(array);
			System.out.println(data);
			
			//Close the input Stream
			input.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
