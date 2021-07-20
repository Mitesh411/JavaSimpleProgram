package additionalTopic;

public class GenericMethod {
	public static void main(String[] args) {
		//initialize the Class with Integer data 
		DemoClass demo = new DemoClass();
		
		// Generics method working with String
		demo.<String>genericMethod("Java Programming");
	
		//Generics working with Integer
		demo.<Integer>genericMethod(25);
	}

}


class DemoClass{
	//Create a Generic Method
	public<T> void genericMethod(T data) {
		System.out.println("Generics Method");
		System.out.println("Data Passed"+data);
	}
}