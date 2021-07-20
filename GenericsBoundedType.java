package additionalTopic;


class GenericsClass<T extends Number>{
	public void display() {
		System.out.println("This is a bounded Type Generics Class");
	}
}


public class GenericsBoundedType {
	public static void main(String[] args) {
    // Create an object of Generics Class
		GenericsClass<String> obj = new GenericsClass<>();
		
	}
}
