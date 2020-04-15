package week10Lab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question8 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(7);

		
		// First Solution
		int [] arr = new int[5];
		int a = 0;
		for (Integer i : set) {
			arr[a++] = i;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// Second Solution
		int [] arr1 = new int[5];
		
		Iterator<Integer> iterator = set.iterator();
		
		for (int i = 0; i < set.size(); i++) {
			if (iterator.hasNext()) {
				arr1[i] = iterator.next();
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		// Third Solution
		int [] arr2 = new int[5];
		Iterator<Integer> iterator2 = set.iterator();
		int index = 0;
		while (iterator2.hasNext()) {
			arr2[index++] = iterator2.next();
			
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
