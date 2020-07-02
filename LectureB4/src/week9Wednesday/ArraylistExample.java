package week9Wednesday;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		
		// Arraylist is a list type which we can store multiple Objects
		// Storing objects as ordered (keeping insertion order)
		ArrayList list = new ArrayList<>();
		list.add("String");
		list.add(111);
		list.add(true);
		list.add(9.8);
		//System.out.println(list);
		
		// For Each Loop 
		for (Object object : list) {
		//	System.out.println(object);
		}
		
		// For Loop
		for (int i = 0; i < list.size(); i++) { //size() : returns the length of Arraylist
			System.out.println(list.get(i)); // get() retrieves elements from Arraylist
		}
		
		
		
	}

}
