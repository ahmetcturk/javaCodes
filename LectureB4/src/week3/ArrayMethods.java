package week3;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// Arrays.sort method sorts the arrays in ascending order 
		// or alphabetic order
		int [] array1 = {4,3,6,9,8,1,3};
		System.out.println("This is original : " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("This is sorted : " + Arrays.toString(array1));

		String [] array2 = {"Zeynep","Ahmet", "James", "Robert"};
		Arrays.sort(array2);
		System.out.println("This is sorted : " + Arrays.toString(array2));
		
		// binarySearch() is finding the index number of target value
		int [] array3 = {3,6,7,9,1,4};
		Arrays.sort(array3);
		System.out.println("This is array3 : " + Arrays.toString(array3));
		System.out.println(Arrays.binarySearch(array3,9));
		
	}

}
