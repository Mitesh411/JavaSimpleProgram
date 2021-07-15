package FileIOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileIOStreamWrite {
	public static void main(String[] args) {
		String data = "This is a Line inside a  Test File";
		try {
			OutputStream out = new FileOutputStream("D:outputfile.txt");
			// Converts the String into bytes 
			byte[] dataBytes = data.getBytes();
			
			//Write the data to the Output Stream 
			out.write(dataBytes);
			System.out.println("Data to be written on File");
			
			//Close the Output Stream 
			out.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
