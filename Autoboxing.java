package additionalTopic;

import java.util.ArrayList;

public class Autoboxing {
	public static void main(String[] args) {
		
		/*Due to autoboxing , the Primitive value is automatically 
		 * converted into Integer object 
		 * and stored in the array List
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//autoboxing
		list.add(5);
		list.add(6);
		
		System.out.println("Array List :- "+ list);
 	}
}
