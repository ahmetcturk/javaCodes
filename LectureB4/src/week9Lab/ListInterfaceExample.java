package week9Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

// List interface : Vector, ArrayList, LinkedList

public class ListInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arraylist default capacity = 10
		
		// Lists : all list classes are ordered (maintains insertion order)
		// all list classes are indexed
		
		// Arraylist vs Vector : Vector is sysncronized , arraylist can be sync. implicitly
		
		// Arraylist uses dynamic array - Linked list uses doubly linked list
		// Arraylist manipulation is slower than LinkedList
		// Linked list acts like list and queue, arraylist acts like a list
		// Arraylist is good for accessing or sorting the data
		// Linked is better for data manipulation
		
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add("String");
		arrayList.add(9);
		
		ArrayList<Object> arrayList2 = new ArrayList<>();
		arrayList2.add(9);
		arrayList2.add("Ahmet");
		arrayList2.add(new ListInterfaceExample());
		arrayList2.add(new CreditCard());
		System.out.println(arrayList2.get(0));
		
		// LinkedList
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add(9);
		linkedList.add("String");
		
		System.out.println(linkedList.get(0));
		
		Iterator iterator = linkedList.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		// Vector 
		Vector<Object> vector = new Vector<>();
		
		vector.add(900);
		vector.add("String 99");
		System.out.println(vector.get(0));
		
		
		
		
		
		

	}

}
