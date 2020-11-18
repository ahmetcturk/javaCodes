package week3Saturday;

import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		// For Loop : 
		
		// 0,2,4
		for (int i = 0; i <= 5; i+=2) {
			//System.out.println( i + " : Hello");
		}
		
		// 0,-1,-2,-3,-4,-5
		for(int i = 0; i>=-5; i--){
			//System.out.println(i);
		}
		
		
		// Create an empty array and fill this empty array with another array
		int arr[] = {55,66,44,33,22};
		
		int newArr[] = new int[arr.length]; // 0,0,0,0,0
		
		System.out.println(Arrays.toString(newArr));
		
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		

	}

}
