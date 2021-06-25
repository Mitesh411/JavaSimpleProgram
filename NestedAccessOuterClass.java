package com.java.Program;

class Car {
	String carName;
	String carType;

	// assign values using Constructor
	public Car(String name, String type) {
		this.carName = name;
		this.carType = type;

	}

	// Private Method

	private String getCarName() {
		return this.carName;
	}

	// Inner Class
	class Engine {
		String engineType;

		void setEngine() {
			// Accessing the carType Property of Car
			if (Car.this.carType.equals("4WD")) {
				// Invoking method getCarName() of Car
				if (Car.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				} else {
					this.engineType = "Bigger";
				}
			} else {
				this.engineType = "Bigger";

			}

		}
		String getEngineType() {
			return this.engineType;
		}
	}

}

public class NestedAccessOuterClass {
	public static void main(String [] args) {
		// Create an Object of Outer Class Car
		Car car1 = new Car("Mazda", "8WD");
		
		// Create an object of inner Class using the Outer Class
		Car.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println(" Engine Type for 8WD = "+ engine.getEngineType());
		
		Car car2 = new Car("Crysler", "4WD");
		Car.Engine engine2 = car2.new Engine();
		engine2.setEngine();
		System.out.println("Engine for 4WD = "+ engine2.getEngineType());
		
		
		
	}
}
