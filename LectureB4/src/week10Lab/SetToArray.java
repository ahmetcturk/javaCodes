package week10Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		
		
		int arr[] = new int[set.size()];
		
		Iterator<Integer> iterator = set.iterator();
		
		int index = 0;
		while(iterator.hasNext()){
			arr[index] = iterator.next();
			index++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
