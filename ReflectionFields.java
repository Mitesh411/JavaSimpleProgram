package com.java.Program;
import java.lang.reflect.*;
import java.lang.Class;


class Trex{
	public String type;
	
}


public class ReflectionFields {
	public static void main(String[] args) {
		try {
			// create an object of Trex
			Trex tx = new Trex();
			
			// create an object of  Class
			// using getClass()
			Class cl = tx.getClass();
			
			// access and set the type field
			
			Field field1 = cl.getField("type");
			field1.set(tx, "Labrador");
			
			// get the value of the Field Type
			String typeValue = (String) field1.get(tx);
			System.out.println("Value: "+typeValue);
			
			
			// get the access modifier of Field type 
			
			int mod = field1.getModifiers();
			
			
			
			// get the access modifier to String Form 
			String modifier1 = Modifier.toString(mod);
			System.out.println("Modifier: "+modifier1);
			System.out.println(" ");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
