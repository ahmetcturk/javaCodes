package week3Lab;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements your array is going to hold ? : ");
		int arrayLength = scanner.nextInt();
		int [] arr = new int[arrayLength];	
		
		for(int i=0; i < arr.length; i++) {
			 // System.out.println("Enter number " + (i+1));
			  arr[i] = scanner.nextInt();
			  }
		// for loop
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		}
		// for enhanced loop
		for (int i : arr) {
			//System.out.println(i);
		}
		// while loop
		int i = 0;
		while (i < arrayLength) {
			//System.out.println(arr[i]);
			i++;
		}

	}

}
