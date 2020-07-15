package week10Recap;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class CollectionExamples {

	// ListIterator vs Iterator : We can iterate only list with listIterator
	// With listIterator, we can iterate trough bacward and forward
	
	public static void main(String[] args) {
		
		// How to declare collection references
		// Lists, Sets or in queue
// Formula : ClassName<ObjectType> referenceName = new ClassName<>();
// Formula : InterfaceName<ObjectType> referenceName = new ClassName<>();
		
		List<String> collection1 = new LinkedList<>();
		Set<Object> collection2 = new HashSet<>();
		
		// Map
// Formula : ClassName<Key,Value> referenceName = new ClassName<>();
// Formula : InterfaceName<Key,Value> referenceName = new ClassName<>();
	
		
		
		collection1.add("String 1");
		collection1.add("String 2");
		collection1.add("String 3");
		for (int i = 0; i < collection1.size(); i++) {
			//System.out.println("Index No " + i +collection1.get(i));
		}
		
		collection2.add("String 1");
		collection2.add("String 2");
		collection2.add("String 3");
		
		for (Object object : collection2) {
			//System.out.println("Object : "+ object);
		}
		
		// Iterator
//		Iterator iterator = collection2.iterator();
//		while(iterator.hasNext()){
//			//System.out.println(iterator.next());
//		}
		
		Map<Integer, String> collection3 = new TreeMap<>();
		collection3.put(0, "123");
		collection3.put(1, "1234");
		collection3.put(2, "12345");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(collection3.get(i));
		}
		// get values 
		for (Object integer : collection3.values()) {
			System.out.println("values : " + integer);
		}
		// get keys
		for (Integer object : collection3.keySet()) {
			System.out.println("keys : " + object);
		}
		
		// key and value together
		for (Integer keys : collection3.keySet()) {
			String value = collection3.get(keys);
			System.out.println("Keys : " + keys + " " +
						"values : " + value);
		}
		
	}

}
