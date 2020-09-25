package week13Wednesday;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewPart2 {

	public static void main(String[] args) {
		
		// 1) Create a program that can find the ascii value of the characters
		char character = '∑';
		System.out.println((int)character);
		
		int ascii = character;
		System.out.println(ascii);
		
		
		// 2) Find the greatest number out of 3 numbers
		int x = 9, y= 3, z = 6;
		if (x>y && x>z) {
			System.out.println(x);
		} 
		else if (y>x && y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
		// 3) Generate a multiplication table
		
		int tableNumber = 8;
		
		for (int i = 1; i <= 10; i++) {
			//System.out.println(tableNumber +"X" + i +" = " + tableNumber*i);
		}
		
		// 4) Print alphabet (a-z) with using loop
		for (char c = 'a' ; c<='z' ; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		// 5) Find the number of digits of the variables
		int number = 433000; // 4 digits
		
		int digits= 0;
		 while (number >0) {
			number /= 10;
			digits++;
		}
		
		System.out.println(digits);
		
		
		// 6) Largest Number in array using Collections.sort method
		Integer [] arr = {11,2,3,4,44,5,77,4};
		
		List<Integer> list  = Arrays.asList(arr);
		
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-1));
		
		
		
		
		
		

	}

}
