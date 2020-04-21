package secondPackage;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class ForLoop {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
//		for(initialization; condition ; increment/decrement)
//		{
//		   statement(s);
//		}
		
		// this for loop will print out number from 0-100
		
		for (int i = 0; i < 101; i++) {
			//System.out.println(i); // this print method is being iterated for 100 times
			//System.out.println( i +" : Hello Silicone Labs");
		}
		
		// we can use for loop for printing array elements
		
		int [] arr = {1,2,3,4,5,7,6};
		for (int i = 0; i < 7; i++) {
			//System.out.println(arr[i] + 90); // we can handle the elements of the arrays.
		}
		
		
		// we can create an array which is printing numbers from 10-1 (reverse)
		
		for (int i = 10; i > 1; i--) {
		//	System.out.println(i);
		}
		
		
		// we can initialize the integer outside of the for loop
		
		int a = 0;
		for (; a<5;a++) {
			//System.out.println(a+ " : Java");
		}
		
		
		// we can create a for loop which increase by 2
		
		for (int i = 0; i < 20; i+=2) {
			//System.out.println(i);// it prints the numbers increasing 2 by 2
		}
		
		
		// Create a program to find the even numbers in the array
		int [] nums = {1,2,3,4,5,6,7,8};
		for (int i = 0; i < nums.length; i++) {
			// How can i know if a number is even or odd ? 
			// if number is divisible by 2, then it is even, otherwise , it's odd
			if (nums[i] %2 ==0) {
				System.out.println( nums[i] + " : This number is even");
			} else {
				System.out.println( nums[i] + " : This number is odd");
			}
		}
		
	}

}
