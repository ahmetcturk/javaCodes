package week10Lab;

import java.util.HashMap;
import java.util.Map;

public class Question9 {

	public static void main(String[] args) {
		
		// Check if our map is holding a key
		
		Map <Integer, String>  map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		int targetKey = 9;
		if (map.containsKey(targetKey)) {
			System.out.println(map.get(targetKey));
		} else {
			System.out.println("Key Not Found !");
		}
		
		
	}

}
