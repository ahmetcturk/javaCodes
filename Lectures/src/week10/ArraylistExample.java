package week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExample {
	
	public static void main(String[] args) {
		
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		ArrayList<String> arrayList = new ArrayList<>(2);
		arrayList.add("Java");
		arrayList.add("Soap");
		arrayList.add("Rest");
		arrayList.add("Cucumber");
		
		// Iterator
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}		
		
		// for loop
		for (int i = 0; i < arrayList.size(); i++) {
			//System.out.println(arrayList.get(i));
			if (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
		
	}

}
