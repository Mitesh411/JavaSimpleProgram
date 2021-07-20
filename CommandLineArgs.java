package additionalTopic;

public class CommandLineArgs {
	public static void main (String[] args) {
		System.out.println("Commands Line Arguments Are :-");
		
		//Loop through all Arguments 
		for (String string : args) {
			System.out.println(string);
		}
	}
}
