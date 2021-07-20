package additionalTopic;

@FunctionalInterface
interface Inter{
	//abstract method
	String reverse(String n);
	
}

public class LambdaInterfacewithParameter {
	public static void main(String[] args) {
		//declare a reference to MyInterFace
		//assign a Lambda expression to the reference
		
		Inter ref = (str) ->{
			String result = "";
			for (int i = str.length() -1; i >=0; i--) 
				result += str.charAt(i);
				return result;
				
			};
		//Call the Method of the Interface
		System.out.println("Lambda reversed = "+ref.reverse("Lambda"));	
	}
}
