package week9Thursday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> emails = new LinkedHashMap<String, String>();
		// put() method adds elements to map
		// keys are unique but values can be duplicated value
		
		emails.put("acturk@siliconelabs.com", "123456");
		emails.put("bob@siliconelabs.com", "123456");
		emails.put("rob@siliconelabs.com", "rob1990");
		emails.put("cemil@siliconelabs.com", "cemil000");
		emails.put("amy@siliconelabs.com", "Amy.1990");
		
		System.out.println(emails.get("amy@siliconelabs.com"));
		
		for (Map.Entry entry : emails.entrySet() ) {
			System.out.println("Key : " + entry.getKey() + "\nValue : " + entry.getValue());
		}
		
		
		

	}

}
