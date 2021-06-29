package com.java.Program;

class ListOfNum{
	public int[] arr = new int[10];
	
	public void writeList() {
		try {
			arr[10] = 11;
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception => "+ e.getMessage());
		}
		catch (IndexOutOfBoundsException e1) {
			System.out.println("Index Out of Bound Exception => "+e1.getMessage());
		}
	}
}
 
public class ExceptionMultipleCatchBloack {
	public static void main(String[] args) {
		ListOfNum listnumb = new ListOfNum();
		listnumb.writeList();
	}
}
