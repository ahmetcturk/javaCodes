package week9Wednesday;

import java.util.LinkedList;

public class LinkedListConcept {

	// Arraylist uses dynamic array - Linked list uses doubly linked list
	// Arraylist manipulation is slower than LinkedList
	// Linked list acts like list and queue, arraylist acts like a list
	// Arraylist is good for accessing or sorting the data
	// Linked is better for data manipulation
	
	public static void main(String[] args) {
	// Linkedlist is also oredered and it keeps it's insertion order
		LinkedList linkedList = new LinkedList<>();
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(6);
		
		// Print it with for loop
		
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		

	}

}
