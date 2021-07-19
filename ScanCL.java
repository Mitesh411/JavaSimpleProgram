package additionalTopic;

import java.util.Scanner;

public class ScanCL {
	// Read a Line of Text Using Scanner

	public static void main(String[] args) {

		// Create a Object of Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your Name :- ");

		// takes input from the Keyboard
		String name = input.nextLine();

		// Prints the name
		System.out.println("My Name is :- " + name);

		// Close the Scanner
		input.close();

	}

}
