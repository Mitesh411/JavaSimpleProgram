package additionalTopic;

import java.util.ArrayList;

public class Unboxing {
	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList<>();
		
		//autoboxing
		lists.add(5);
		lists.add(6);
		
		System.out.println("Array List :- "+ lists);
	
		//unboxing 
		int a = lists.get(0);
		System.out.println("Value at Index at 0 :- " +a);
	
	}
}
