package additionalTopic;

import java.util.List;
import java.util.ArrayList;

public class LambdaStreamAPIProgram {
	
	// Create an object of List using ArrayList
	 static List<String> places = new ArrayList<>();
	
	//Preparing our Data
	public static List getPlaces() {
		//add place and country to the List
	    places.add("Nepal, Kathmandu");
	    places.add("Nepal, Pokhara");
	    places.add("India, Delhi");
	    places.add("USA, New York");
	    places.add("Africa, Nigeria");
	    
	    return places;
	    
	}

public static void main(String[] args) {
	List<String> myplaces = getPlaces();
	System.out.println("Places From Nepal");
	
	//Filter Places from Nepal
	myplaces.stream()
			.filter((p)->p.startsWith("Nepal"))
			.map((p)-> p.toUpperCase())
			.sorted()
			.forEach((p)-> System.out.println(p));
			

}



}
