package FileIOStream;

import java.io.ByteArrayInputStream;

public class FileIOByteArrayInputStream {
	public static void main (String[] args) {
		// Create an array of bytes
		byte[] array = {1,2,3,4};
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			System.out.println("The Bytes read from the input Stream ");
			for (int i = 0; i < array.length; i++) {
				//Read the Bytes 
				int data = input.read();
				System.out.print(data + ", ");
			}
			input.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
