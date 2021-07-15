package FileIOStream;

import java.io.ByteArrayOutputStream;

public class FileIOByteArrayOutputStream {
	public static void main(String[] args) {
		String datas = "This is a Line of Text inside a String";
		try {
			//Create an Output Stream 
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] arr = datas.getBytes();
			
			//Write data to the Output Stream
			out.write(arr);
			
			//Retrieves data from the output Stream in String Format
			String StreamData = out.toString();
			System.out.println("Output Stream :- "+StreamData);
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

}
