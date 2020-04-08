package week10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Ahmet");
		hashSet.add("Hasan");
		hashSet.add("Murat");
		hashSet.add("Can");
		hashSet.add("Abdullah");
		hashSet.add("Can");
		hashSet.add("Can");
		hashSet.add("Can");
		System.out.println(hashSet);
		
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
