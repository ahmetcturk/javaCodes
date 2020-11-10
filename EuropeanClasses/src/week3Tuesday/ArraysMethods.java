package week3Tuesday;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		
		// Arrays is a class in util package 
		// sort, equals, binarySearch, fill
		
		// Sort : Sorting the arrays in numeric order or alphabetic order
		int [] numbers = {3,5,7,6,4,2,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		String names [] = {"Zeynep", "Ahmet", "Burak", "John", "Grace","Jessi"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		// BinarySearch Method : It returns the element in specific index number
		// In order to use binarySearch method, we need to sort the array
		
		System.out.println(Arrays.binarySearch(names, "Zeynep"));
		
		int [] arr = {5,4,3,2,1};
		Arrays.sort(arr);
		// 1,2,3,4,5
		System.out.println(Arrays.binarySearch(arr, 5));
		
		
		// Equals method : returns true if two arrays are same 
		System.out.println(Arrays.equals(arr, numbers));
		
		// fill : fill method fills the array with specific value
		int fives[] = new int[5];
		Arrays.fill(fives, 5);
		System.out.println(Arrays.toString(fives));
		
		// Create an integer array and print maximum and minimum number of the array
		int [] number2 = {66,5,44,88,99,11,0,100,-9,0};
		Arrays.sort(number2);
		System.out.println(Arrays.toString(number2));
		System.out.println(number2[0]);
		System.out.println(number2[number2.length-1]);
		
		
		
	}

}
