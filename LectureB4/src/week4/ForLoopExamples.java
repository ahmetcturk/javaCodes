package week4;

import org.omg.CosNaming._BindingIteratorImplBase;

public class ForLoopExamples {

	public static void main(String[] args) {
		// There are 3 loops in java
		// For Loops, While loops, do While loops
		// For Loops
		// Loops : Making something repetitively
		
		// How to do the statement below 1000
		// System.out.println("Hello Silicone Labs");
		
		// Create an integer, and increase it by one until it reaches 3
		// In every step you are increasing, print statement
		// i = 0 : Step 1
		// i = 1 : Step 2
		// i = 2 : Step 3
		
		for(int i = 0 ; i < 1000 ; i++){
			//System.out.println("Hello Silicone Labs");
			//System.out.println(i);
			//System.out.println(i + " : Hello Silicone Labs");
		}

		// printing array elements
		
		int [] array = {5,4,3,2,1};
		
		for(int i = 0 ; i < 5; i++ ){
		// System.out.println(array[i] + 30);
		}
		
		
		// we can create a for loop which is printing numbers from 10-1
		
		// Create an integer, and decrease it by one until it reaches 0
		// In every step you are decreasing, print statement
		// i = 3 : Step 1
		// i = 2 : Step 2
		// i = 1 : Step 3
		
		for(int i = 3; i > 0; i-- ){
			//System.out.println(i);
		}
		
		// i++ = {i = i + 1}
		// i = 0 : Step 1
		// i = 5 : Step 2
		// i = 10 : Step 3
		// i = 15 : Step 4
		for(int i = 0 ; i < 20; i = i+5){ // i = i * 5 , i = i * 10 ... i = i + 13
			//System.out.println(i);
			}
		
		
		// Multiplication table of 5
		
		for (int i = 0; i < 10; i++) {
			System.out.println(5 + "X" + i + " = " + (5*i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
