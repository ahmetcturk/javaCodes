package week10Monday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set1.add((int) (Math.random() * 10 + 1));
		}
		
		// Find sum of the elements in this set with iterator
		
		Iterator<Integer> iterator = set1.iterator();
		int sum = 0;
		
		System.out.println("Set : ");
		
		for (Integer integer : set1) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		while (iterator.hasNext()) {
			sum += iterator.next();
		}
		
		System.out.println(sum);
		
		// Convert this set to arraylist
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// whenever you want to use iterator again, you need to re-initialize it
		Iterator<Integer> iterator2 = set1.iterator();
		while (iterator2.hasNext()) {
			
			list.add(iterator2.next());
			
		}
		System.out.println("Arraylist:  ");
		System.out.println(list);
		
		// Convert the list into treeSet
		Set<Integer> set = new TreeSet<>();
		// loops trough the list
		for(int i=0;i<list.size();i++){
			set.add(list.get(i));
		}
		System.out.println("Set :");
		System.out.println(set);
		

	}

}
