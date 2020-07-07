package week10Monday;

import java.util.*;

public class ListExample {

	public static void main(String args[]) {
		// Iterator works in list, queue and map, it can traverse elements
		// forward
		// ListIterator only works in list, it can traverse elements backward
		// and forward

		int a = 9;
		// Boxing : from primitive to object
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(a);
		// System.out.println(list1.get(0)); // Unboxing : from object to
		// primitive

		// Upcasting
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new LinkedList<Integer>();
		List<Integer> list4 = new Vector<Integer>();

		// Arraylist fill 10 integers from 1-10
		for (int i = 0; i < 10; i++) {
			list2.add((int) (Math.random() * 10 + 1));
		}

		// Linkedlist 10 integers 1-10
		for (int i = 0; i < 10; i++) {
			list3.add((int) (Math.random() * 10 + 1));
		}

		// Vector 10 integers 1-10
		for (int i = 0; i < 10; i++) {
			list4.add((int) (Math.random() * 10 + 1));
		}

		// Use ListIterator to traverse forward direction and backward direction
		
		ListIterator<Integer> listIterator = list4.listIterator();
		
		System.out.println("Vector forward : ");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		
		System.out.println();
		System.out.println("Vector backward : ");
		while (listIterator.hasPrevious()) {
		System.out.print(listIterator.previous() + " ");
			
		}
		
		System.out.println();
		
		
		
		// Iterate trough list3 with Iterator
		Iterator<Integer> iterator2 = list3.iterator();
		System.out.println("Linked List");
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();

		// Iterate trough list2 with ListIterator
		ListIterator<Integer> iterator1 = list2.listIterator();
		System.out.println("Arraylist : ");
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}

	}
}
