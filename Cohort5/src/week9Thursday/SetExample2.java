package week9Thursday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		
		// Linkedlist : sequence of links
		
		Set<Integer> set1 = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set1.add((int)(Math.random()*10+1));
		}
		
		Iterator<Integer> iterator = set1.iterator();
		// Find the sum of the element in the set - use iterator
		// Try until 9 : 33 pm
		int sum = 0 ; 
		System.out.println(set1);
		
		while (iterator.hasNext()) {
			sum+= iterator.next();	
		}
		System.out.println(sum);
		
		// Convert the set into arraylist
		List<Integer> list = new ArrayList<Integer>(set1);
		
		Iterator<Integer> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
		
		

		
	}

}
