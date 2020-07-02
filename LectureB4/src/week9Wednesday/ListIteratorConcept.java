package week9Wednesday;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorConcept {

	public static void main(String[] args) {
		// Initial capacity of arraylist = 10
		
		
		ArrayList<Double> arraylist1 = new ArrayList<Double>();
		
		arraylist1.add(9.9);
		arraylist1.add(42.98);
		arraylist1.add(42.99);
		arraylist1.add(40.00);
		
		ListIterator iterator = arraylist1.listIterator();
		
		System.out.println("Traversing forward direction : ");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Traversing backward direction : ");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}

	}

}
