package week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import javax.swing.InputMap;

public class Group3 {

	public static void main(String[] args) {

		// Create a set Integer type, and find the sum of the elements.

		Set<Integer> set = new HashSet<>();
		set.add(8);
		set.add(5);
		set.add(7);
		set.add(8);

		System.out.println(set);

		// Find the sum of the set elements
		Iterator<Integer> iterator3 = set.iterator();
		int sum = 0;
		for (int i = 0; i < set.size(); i++) {
			if (iterator3.hasNext()) {
				sum += iterator3.next();
			}
		}
		System.out.println(sum);

		// Put the set elemets inside of then arraylist
		ArrayList<Integer> arrayList = new ArrayList<>();

		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			arrayList.add(iterator.next());

		}
		System.out.println(arrayList);

		// Convert arraylist into set
		Set<Integer> set1 = new HashSet<>();

		for (int i = 0; i < arrayList.size(); i++) {
			set1.add(arrayList.get(i));
		}
		System.out.println(set1);

		// Convert this array to arraylist
		int[] arr = { 1, 2, 3, 4, 5 };

		ArrayList<Integer> arrayList2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrayList2.add(arr[i]);
		}

		System.out.println(arrayList2);

		//
		HashSet<String> hashSet = new HashSet();
		// Duplicated elements will be ignored because set can only hold unique
		// values
		hashSet.add("Treeset");
		hashSet.add("HashSet");
		hashSet.add("ArrayList");
		hashSet.add("ArrayList");
		hashSet.add("LinkedList");
		String concat = "";// TreesetHashSetArrayListArrayListLinkedList

		for (String string : hashSet) {
			concat += string;
		}
		System.out.println(concat);
		// create an empty linked list
		LinkedList<String> linked_list = new LinkedList<String>();
		linked_list.add("Red");
		linked_list.add("Green");
		linked_list.add("Black");
		linked_list.add("White");
		linked_list.add("Pink");
		System.out.println("Original linked list: " + linked_list.get(1));
	}

}
