package additionalTopic;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		//Create a File Object 
		File file = new File("file2.txt");
		
		//Deletes the file
		boolean value = file.delete();
		if (value) {
			System.out.println("The File is Deleted");
		}else {
			System.out.println("The File is not Deleted Yet");
		}
		
		
		
	}
}
