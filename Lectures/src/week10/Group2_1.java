package week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Group2_1 {

	public static void main(String[] args) {
		Set<String> names= new HashSet();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")) {
		
		}
		System.out.println(names);

		Set<Integer> numbers= new TreeSet();
		numbers.add(5);
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		System.out.println(numbers);
		// Question 1 : What is the sum of the elements in numbers set ? 
		
		// Solution 1
		Iterator<Integer> iterator = numbers.iterator();
		int sum = 0;
		while (iterator.hasNext()) {
			sum = sum + iterator.next();		
		}
		System.out.println(sum);
		
		// Solution 2
		Iterator<Integer> iterator1 = numbers.iterator();
		
		int sum1 = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (iterator1.hasNext()) {
				sum1 = sum1 + iterator1.next();	
			}
			
		}
		System.out.println(sum1);
		
	}

}
