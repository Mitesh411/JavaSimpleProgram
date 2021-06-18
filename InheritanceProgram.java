package com.java.Program;

class Employee{
	float salary = 40000;
	
}

public class InheritanceProgram extends Employee{
	int bonus = 10000;
	public static void main(String[] args) {
		InheritanceProgram obj = new InheritanceProgram();
		System.out.println("Programmer Salary is " + obj.salary);
		System.out.println("Bonus of Programmer is "+ obj.bonus);
		
	}
}
