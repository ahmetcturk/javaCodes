package week10Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		// Convert a linkedlist to Arraylist
		
		List linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,"String", true, (5>9)));
		
		// First Solution
		ArrayList arrayList = new ArrayList<>(linkedList);
		
		// Second Solution
		ArrayList arrayList2 = new ArrayList<>();
		
		for (int i = 0; i < linkedList.size(); i++) {
			arrayList2.add(linkedList.get(i));
		}
		
		System.out.println(arrayList);
		System.out.println(arrayList2);
		
		

	}

}
