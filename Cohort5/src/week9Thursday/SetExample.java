package week9Thursday;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
	    // HashSet : Stores the data in hash table, not maintaining insertion order
		// Only Unique Elements
		
		Set<String> set = new HashSet<>();
		set.add("Selenium");
		set.add("Java");
		set.add("Ruby");
		set.add("Python");
		set.add("Java");
		
		System.out.println(set);
		
		// LinkedHashSet : Maintaining insertion order
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("Selenium");
		set2.add("Java");
		set2.add("Ruby");
		set2.add("Python");
		set2.add("Java");
		System.out.println(set2);
		
		// TreeSet : Stores the data in ascending order, alphabetic order
		Set<String> set3 = new TreeSet<>();
		set3.add("Selenium");
		set3.add("Java");
		set3.add("Ruby");
		set3.add("Python");
		set3.add("Java");
		System.out.println(set3);
		 
		printer(set3);
		printer(set2);
		printer(set);
		
	}
	
	static void printer(Set set){
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
