package week4Lab;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the capacity of array ? : ");
		
		int count  = input.nextInt();
		
		int[] nums = new int[count];

		// using a loop enter values one by one
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter number " + (i + 1));
			nums[i] = input.nextInt();
		}
		
		
		// Print array in for loop
		
		for (int i = 0; i < nums.length; i++) {
			//System.out.println(nums[i]);
		}
		
		// Print array with for each loop (for enhanced loop)
		
		for (int i : nums) {
			//System.out.print(i + " ");
		}
		
		// while loop
		
		int i = 0;
		while(i<nums.length){
			System.out.println(nums[i]);
			i++;
		}
		
		
		
		
		
		

	}

}
