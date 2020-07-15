package week10Lab;

import java.util.Map;
import java.util.TreeMap;

public class Question8 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("Ahmet", 25);
		map.put("Cemil", 26);
		map.put("Bob", 27);
		map.put("Robert", 28);
		
		// containsValue()
		 if (map.containsValue(30)) {
			System.out.println("Value found");
		} else {
			System.out.println("Value not found");
		}
		
	}

}
