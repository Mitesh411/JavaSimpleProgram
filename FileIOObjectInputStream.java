package FileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOObjectInputStream {
	public static void main(String[] args) {
		int data1 = 5;
		String data2 = "This is a Programiz";
		
		try {
			FileOutputStream file = new FileOutputStream("D:input.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			
			//Writing to the file using ObjectOutputStream
			output.writeInt(data1);
			output.writeObject(data2);
			
			FileInputStream filestream = new FileInputStream("D:input.txt");
			
			//Creating an Object input Stream 
			ObjectInputStream objstream = new ObjectInputStream(filestream);
			
			//Using the readInt() method 
			System.out.println("Integer Data :- " +objstream.readInt());
			
			//Using the readObject() method
			System.out.println("String Data :- " + objstream.readObject() );
			
			
			output.close();
			objstream.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
