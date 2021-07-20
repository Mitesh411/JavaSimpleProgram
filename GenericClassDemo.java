package additionalTopic;

public class GenericClassDemo {
	public static void main(String[] args ) {
		// initialize Generic Class
		// with Integer Data
		GenericD<Integer> intObj = new GenericD<>(5);
		System.out.println("Generic Class Return :"+intObj.getData());
		
		//initialize generic class
		//with String Data
		GenericD<String> stringObj = new GenericD<>("Java Programming");
		System.out.println("Generic Class Returns :-  "+stringObj.getData());
		
	}
}
	//Create a Generic Class
	class GenericD<T>{
		// Variable of T type
		private T data ;
		
		public GenericD(T data) {
			this.data = data;
		}
		
		//method that return T type variable
		public T getData() {
			return this.data;
		}
		
		
	}