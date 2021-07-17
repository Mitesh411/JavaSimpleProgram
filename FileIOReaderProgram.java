package FileIOStream;

import java.io.FileReader;
import java.io.Reader;

public class FileIOReaderProgram {
	public static void main(String[] args) {

		// Creates an Array of Character
		char[] array = new char[100];

		try {
			// Creates a Reader using a FileReader
			Reader input = new FileReader("file.txt");

			// check if the Reader is ready
			System.out.println("Is there data in the stream ? :- " + input.ready());

			// Reads Characters
			input.read(array);
			System.out.println("Data in the Stream");
			System.out.println(array);

			// Closes the Reader
			input.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}

	}

}
