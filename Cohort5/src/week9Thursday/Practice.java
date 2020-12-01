package week9Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		
		// Write a program that removes duplicate element of arraylist and sort the elements
		List<Integer> IDs = new ArrayList<Integer>();
		IDs.addAll(Arrays.asList(4298,4305,4300,4301, 4312, 4306,4298));
		// Collection
		//Collections.sort(IDs);
		System.out.println(IDs);
		
		List<Integer> newIDs = new ArrayList<>(new TreeSet<>(IDs));
		System.out.println(newIDs);
		
		// frequency
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C","D","D","D"));
		System.out.println(Collections.frequency(list, "D"));

	}

}
