package additionalTopic;

public class WrapperClass {
	public static void main(String[] args) {
		
		//Create Primitive Types
		int a =5;
		double b = 5.65;
		
		
		//Converts into Wrapper Class
		Integer aObj = Integer.valueOf(a);
		Double bObj = Double.valueOf(b);
		
		if (aObj instanceof Integer) {
			System.out.println("An Object of Integer is Created");
		}
		
		if (bObj instanceof Double) {
			System.out.println("An Object of Double is Created");
		}
	}
}
