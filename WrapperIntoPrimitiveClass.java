package additionalTopic;

public class WrapperIntoPrimitiveClass {
	public static void main(String[] args) {
		
		//Creates a Object of Wrapper Class
		Integer aaObj = Integer.valueOf(23);
		Double bbObj = Double.valueOf(5.55);
		
		//Converts into Primitive Types
		int a = aaObj.intValue();
		double b = bbObj.doubleValue();
		
		System.out.println("The Value of a :- " +a);
		System.out.println("The Value of b :- " +b);
	}
}
