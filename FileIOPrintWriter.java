package FileIOStream;

import java.io.PrintWriter;

public class FileIOPrintWriter {
	public static void main(String[] args) {
		
		String data = "This is a text Updated inside a File ";
		
		try {
			
			PrintWriter output = new PrintWriter("file.txt");
			output.print(data);
			output.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
	}

}
