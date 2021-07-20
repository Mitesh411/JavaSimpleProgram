package additionalTopic;

import java.io.FileReader;

public class FileReaderIn {
	public static void main(String[] args) {
		char[] array = new char[100];
		try {
			// Creates a reader using a File Reader
			FileReader input = new FileReader("file2.txt");

			// Reads Characters
			input.read(array);
			System.out.println("Data in the File");
			System.out.println(array);

			// Close the Reader
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
}
