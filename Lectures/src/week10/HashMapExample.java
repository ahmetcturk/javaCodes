package week10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// Hashmap Example, key is unique, value doesn't have to be unique
		
		HashMap<String,String> emails = new HashMap<>();
		
		emails.put("acturk@siliconelabs.com", "12345");
		emails.put("acturk@siliconelabs.com", "12345");
		emails.put("bob@siliconelabs.com", "12345");
		emails.put("cemil@siliconelabs.com", "12345");
		emails.put("huseyin@siliconelabs.com", "12345");
		
//		for (Map.Entry entry : emails.entrySet()) {
//			System.out.println("Keys : " + entry.getKey() + "\n" + "Value : " + entry.getValue());
//		}
		
		Set set = emails.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) iterator.next();
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
 		
		HashMap<String, String> starbucks = new HashMap<>();
		
		starbucks.put("Ahmet", "Pumpkin Spice Latte");
		starbucks.put("Robert", "Peppermint Mocha");
		starbucks.put("Bob", "Cold Brew with Cascara Foam ");
		starbucks.put("Elena", "S'mores Frappucino");
		starbucks.put("Ahmet", "Tea");
		System.out.println(starbucks);
		Set set1 = starbucks.entrySet();
		Iterator iterator3 = set1.iterator();
		while(iterator3.hasNext()){
			HashMap.Entry entry1 = (HashMap.Entry)iterator3.next();
			System.out.println("Key : " + entry1.getKey());
			System.out.println("Value : " + entry1.getValue());
			
		}

		
	}

}
