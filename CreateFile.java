package additionalTopic;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		// Create a File Object of the Current Location
		File file = new File("file2.txt");

		try {
			// trying to create a file based on the project
			boolean value = file.createNewFile();
			if (value) {
				System.out.println("The New File is created ");
			} else {
				System.out.println("The file is already exists");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();

		}
	}

}
