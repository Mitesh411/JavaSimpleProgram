package FileIOStream;

import java.io.StringWriter;

public class FileIOtoString {
	public static void main(String[] args) {
		String data = "This is the Original Data";
		
		
		try {
			//Creates a StringWriter with default string buffer Capacity 
			StringWriter output = new StringWriter();
			
			// Writes data to String Buffer
			output.write(data);
			
			//Returns the String Buffer 
			StringBuffer stringBuffer = output.getBuffer();
			System.out.println("String Buffer :- "+stringBuffer);
			
			//Returns the String Buffer into the String Form 
			String string = output.toString();
			System.out.println("String :- "+string);
			
			output.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			
		}
		
	}
}
