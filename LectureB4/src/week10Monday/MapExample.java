package week10Monday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
 // Hashmap vs hashtable :
	// Hashtable is synchronized, hashmap is not synchronized
	public static void main(String[] args) {
		
		Map<String,String> emails = new LinkedHashMap<>();
		// put() methods add elements to map
		// Keys are unique, but values can be same
		
		emails.put("acturk@siliconelabs.com", "123456");
		emails.put("bob@siliconelabs.com", "111");
		emails.put("rob@siliconelabs.com", "333");
		emails.put("cemil@siliconelabs.com", "123456");
		emails.put("Ahmet", "Can");
		
		for (Map.Entry entry : emails.entrySet()) {
			System.out.println("Keys : " + entry.getKey() + "\n" + "Value : " + 
						entry.getValue());
		}
		
		System.out.println(emails.get("acturk@siliconelabs.com"));
		System.out.println(emails.get("Ahmet"));
		
		// Iterator with map
		
		Set set = emails.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			HashMap.Entry entry = (Entry) iterator.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
			
		}
		
		

	}

}
