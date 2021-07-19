package additionalTopic;

/* Lambda Expression with Parameter
 * 
 */
@FunctionalInterface
interface MyInterfaces {
	// abstract method
	String reverse(String n);

}

public class LambdawithExpression {
	public static void main(String[] args) {

		// declare a reference to MyInterface
		// assign a lambda expression to the reference

		MyInterfaces ref = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;

		};
		// Call the method of the Interface 
		System.out.println("Lambda Reversed = "+ ref.reverse("Lambda"));
	}
}
