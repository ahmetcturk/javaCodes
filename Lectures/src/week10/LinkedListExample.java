package week10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Richard");
		linkedList.add("Robert");
		linkedList.add("Kim");
		System.out.println(linkedList);
		
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
