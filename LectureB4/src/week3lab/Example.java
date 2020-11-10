package week3lab;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		int arr[] = new int [5];
		int arr2[] = new int [5];
		Arrays.fill(arr, 3);
		System.out.println(Arrays.toString(arr));
		arr[2] = 10;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.equals(arr, arr2));
		
	}

}
