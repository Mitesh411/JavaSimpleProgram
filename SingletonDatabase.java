package com.java.Program;

class Database{
	private static Database dbobject;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		// create object if its not already created 
		if (dbobject == null) {
			dbobject = new Database();
		}
		
		// returns the singleton Object
		return dbobject;
		
	}
	
	public void getConnection() {
		System.out.println("You are now Connected to the database");
	}
}


public class SingletonDatabase {
	public static void main(String[] args) {
		Database db1;
		// refers to the only object of the Database
		db1 = Database.getInstance();
		db1.getConnection();
				
	}
}
