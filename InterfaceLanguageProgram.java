package com.java.Program;

//create an interface
interface Lang {
void getName(String name);
}

//class implements interface
class ProgrammingLanguage implements Lang {

// implementation of abstract method
public void getName(String name) {
 System.out.println("Programming Language: " + name);
}
}


public class InterfaceLanguageProgram {
	public static void main(String[] args) {
		 ProgrammingLanguage language = new ProgrammingLanguage();
		    language.getName("Java");
	}
}