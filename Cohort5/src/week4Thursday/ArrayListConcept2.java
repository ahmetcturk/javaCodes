package week4Thursday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		// Convert array to arraylist
		
		int [] arr = {1,2,3,4,5,6,4,3,2};
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			arrayList.add(arr[i]);
		}
		System.out.println(arrayList);
		
		// Convert array to arraylist
		String [] arr2 = {"Selenium", "Cucumber", "Selenium Grid", "TestNG"};
		
		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(arr2));
		
		
		// Challenge : Create an integer arraylist and find the biggest number 
		
		ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(10,80,70,99,44,57));
		
		int maximum = arrayList3.get(0);
		
		for (int i = 0; i < arrayList3.size(); i++) {
			if (arrayList3.get(i) > maximum) {
				maximum = arrayList3.get(i);
			}
		}
		
		System.out.println(maximum);
		
		
		int maximum2 = arrayList3.get(0);
		for (Integer integer : arrayList3) {
			if (integer > maximum2) {
				maximum2 = integer;
			}
		}
		
		System.out.println(maximum2);
		
		
		System.out.println(Collections.max(arrayList3));
		
	}

}
