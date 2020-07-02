package week9Wednesday;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample2 {

	public static void main(String[] args) {
		
		// Generic Arraylist
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("String");
		// arraylist.add(5);
		
		ArrayList<Double> arraylist1 = new ArrayList<Double>();
		
		arraylist1.add(9.9);
		arraylist1.add(42.98);
		arraylist1.add(42.99);
		arraylist1.add(40.00);
		
		// Iterator
		
		Iterator iterator = arraylist1.iterator();
		
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// For loop 
		
		for (int i = 0; i < arraylist1.size(); i++) {
			if (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		
		
		
		
		
	}

}
