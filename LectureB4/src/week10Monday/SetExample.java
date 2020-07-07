package week10Monday;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

public class SetExample {

	public static void main(String args[]) throws InterruptedException {

		// HashSet : Stores data in hash table, not maintaining insertion order
		// Only Unique Elements
		
		Set<String> set = new HashSet<>();
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("Selenium");
		set1.add("Java");
		set1.add("Ruby");
		set1.add("Python");
		set1.add("Java");
		
		System.out.println(set1);
		
		// Maintains insertion order
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Selenium");
		set2.add("Java");
		set2.add("Ruby");
		set2.add("Python");
		set2.add("Java");
		
		System.out.println(set2);
		
		// TreeSet : Stores data in ascending, numeric order and alphabetic order
		
		TreeSet<String> set3 = new TreeSet<>();
		set3.add("Selenium");
		set3.add("Java");
		set3.add("Ruby");
		set3.add("Python");
		set3.add("Java");
		System.out.println(set3);
		
		TreeSet<Integer> set4 = new TreeSet<>();
		set4.add(4);
		set4.add(3);
		set4.add(9);
		set4.add(1);
		set4.add(100);
		set4.add(8);
		System.out.println(set4);
		
		Iterator<Integer> iterator = set4.iterator();
		System.out.println("TreeSet set4 : ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			
		}
		
		
		

	}
}
