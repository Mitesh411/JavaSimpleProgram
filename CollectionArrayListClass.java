package com.java.Program;
import java.util.ArrayList;
import java.util.List;

public class CollectionArrayListClass {
	public static void main(String[] args) {
		// Creating List using the Array List Class
		List<Integer> numbers = new ArrayList<>();
		
		// Add Elements to the List 
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List :- " + numbers);
		
		// Access the Elements from the List
		int number = numbers.get(2);
		System.out.println("Accessed Elements:  "+number);
		
		// Remove Elements from th List 
		int removeNumbers = numbers.remove(1);
		System.out.println("Rmoved Elements :- "+removeNumbers);
		
		
		
	}
}
