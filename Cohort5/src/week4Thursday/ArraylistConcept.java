package week4Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {
		
		// array : variables that can hold multiple values
		// Arraylist vs Array : Arraylist can hold different data types
		// Arraylists are dynamic sized, arrays are static sized
		int []arr = new int[1]; // static sized array : You can only add as the capacity of the array
		arr[0] = 9;
		
		ArrayList list = new ArrayList();
		
		list.add("String");
		list.add(19);
		list.add(19.90);
		
		System.out.println(list);
		
		// Generic Arraylist : They are holding one specific data type
		
		ArrayList<String> buttons = new ArrayList<>(); // Dynamic sized : You can keep adding value
		buttons.add("Run Button"); // 0
		buttons.add("Add Package Button"); // 1
		buttons.add("Debug Button");// 2
		buttons.add("Save Button");// 3
		
		System.out.println(buttons.get(2));
		
		// Print out all the elements of the arraylist with loop
		
		for (int i = 0; i < buttons.size(); i++) {
			//System.out.println(buttons.get(i).toUpperCase().charAt(0));
		}
		
		
		// remove() : Remove method removes the specific index number or specific element from arraylist
		
		buttons.remove(1); // It will remove Run Button
		buttons.remove("Save Button");
		System.out.println(buttons);
		
		
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,9,8,7,6,5,4));
		
		// set() : replaces specific index number with specific character
		numbers.set(0, 900);
		System.out.println(numbers);
		
		// add(index,value)
		numbers.add(0,100);
		System.out.println(numbers);
		
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,9));
		
		// removeAll() : It subtract lists from each other
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		
		// clear() : It clears the arraylist, deletes all the elements
		
		list1.clear();
		System.out.println(list1);
		
		
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		
		// retainAll() : It keeps specific elements and removes rest
		
		list3.retainAll(Arrays.asList(9,8,7,1));
		System.out.println(list3);
		
		
		
		
	}

}
