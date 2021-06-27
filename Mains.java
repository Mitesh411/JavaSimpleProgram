package com.java.Program;

import java.lang.reflect.Modifier;

public class Mains {
	public static void main(String[] args) {
		try {
			// create an object of Dog
			Dogs dg = new Dogs();
			
			// create an object of Class 
			// using getClass()
			
			Class obj = dg.getClass();
			
			
			// get the name of the Class
			String name = obj.getName();
			System.out.println("Name: " +name);
			
			
			//get the Access Modifier of the Class
			int modifier = obj.getModifiers();
			
			//Convert the access modifier to String 
			String mod = Modifier.toString(modifier);
			System.out.println("Modifier: "+mod);
			
			// get the SuperClass of Dog
			Class superClass = obj.getSuperclass();
			System.out.println("SuperClass: "+ superClass.getName());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
