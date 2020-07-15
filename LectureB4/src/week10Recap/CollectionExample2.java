package week10Recap;

import java.util.Map;
import java.util.TreeMap;

// TreeMap
public class CollectionExample2 {

	public static void main(String[] args) {

		
		
		Map<String, String> map1 = new TreeMap<String, String>();

		// enter Title and url
		
		map1.put("Our Team", "https://www.siliconelabs.com/teachers");
		map1.put("About Us", "https://www.siliconelabs.com/aboutus");
		map1.put("Courses", "https://www.siliconelabs.com/courses");
		

		// for each loop 1
		for (Map.Entry<String, String> entry : map1.entrySet()) {
			// System.out.println("[ " + entry.getKey() + "," + entry.getValue()
			// + " ]");
		}

		// for each loops 2
		// key and value together
		for (String keys : map1.keySet()) {
			String value = map1.get(keys);
			System.out.println("Keys : " + keys + " " + "values : " + value);
		}

	}

}
