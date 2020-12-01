package week9Thursday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArraylistConcept {

	public static void main(String[] args) {
// Iterator : iterator is a special objects that point all the elements in the collection classes
		// Iterator can work in list, queue and map
		
		List<String> list1 = new ArrayList<String>(); // Upcasting
		list1.add("student1");
		list1.add("student2");
		list1.add("student3");
		list1.add("student4");
		
		Iterator<String> iterator = list1.iterator();
		
//		while (iterator.hasNext()) {
//			
//			//System.out.println(iterator.next());
//			
//		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(9); // Boxing : conversion from primitive to object
		int number = list2.get(0); // Unboxing : conversion from object to primitive
		
		List<Integer> list3 = new LinkedList<>();
		list3.add(99);
		list3.add(11);
		System.out.println(list3.get(0) + list3.get(1));
		
		// LinkedList           vs           ArrayList 
		// doubly linkedlist                 dynamic array
		// better for manipulate             better for store and fetch
		
		List<Integer> list4 = new Vector<>();
		list4.add(9);
		list4.add(4);
		list4.add(5);
		list4.add(6);
		System.out.println(list4.get(0));
		
		// Vector                vs          ArrayList
		// Synchronised                      Non-synchronised
		// Slower                            Faster
		
		
		// ListIterator Concept
		// List Iterator can traverse list in forward and backward direction
		// List Iterator can be used only in list
		ListIterator<Integer> listIterator = list4.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
		
		
		
		
		

	}

}
