package additionalTopic;

@FunctionalInterface
interface GenericInterface<T> {
	// Generic Method
	T func(T t);
}

public class LambdaGenerics {
	public static void main(String[] args) {
		// declare a reference to GenericInterface
		// the GenericInterface operates o String Data
		// assign a Lambda expression to it

		GenericInterface<String> reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;

		};
		System.out.println("Lambda Reversed :- "+reverse.func("Lambda 123"));
		
		//declare another reference to GenericInterface
		//the GenericInterface operates on Integer data
		//assign a Lambda expression to it 
		GenericInterface <Integer> factorial = (n) ->{
			int result = 1;
			for(int i=1; i<=n; i++)
			result = i * result;	
		    return result;
		    
		};
		System.out.println("Factorial of 5 = "+factorial.func(5));
	}
}
