package myFirstPackage;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// Important Message : Don't name your class Array or Arrays !!!
		
		// datatype arrayname [] = new datatype[lengthofArray] 
		
		int myArray [] = new int[4]; // Array Creating
		myArray[0] = 1;
		myArray[1] = 100;
		myArray[2] = 1000;
		myArray[3] = 10000; // highest index number
		
		// Printing array elements
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		// printing all array  elements in one line
		System.out.println(Arrays.toString(myArray));
		
		int myArray2[] = new  int[4]; // Create another array
		
		// print the elements without initializing
		// Default values of the int array elements are 0
		System.out.println(myArray2[0]);
		System.out.println(myArray2[1]);
		System.out.println(myArray2[2]);
		System.out.println(myArray2[3]);
		
		System.out.println(Arrays.toString(myArray2));
		
		// Second way to create arrays
		
		int myArray3 [] = new int[]{1,2,3,4,5,6,7};
		
		// print the array elements
		System.out.println(myArray3[0]);
		System.out.println(myArray3[1]);
		System.out.println(myArray3[2]);
		System.out.println(myArray3[3]);
		System.out.println(myArray3[4]);
		System.out.println(myArray3[5]);
		System.out.println(myArray3[6]);
		
		// ToString Method
		System.out.println(Arrays.toString(myArray3));
		
		// third way to create an array
		int [] myArray4 = {1000,100,10,1};
		
		System.out.println(Arrays.toString(myArray4));
		
		String [] myArray5 = {"Java", "Eclipse", "Selenium"};
		System.out.println(Arrays.toString(myArray5));
		
		double [] myArray6 = {9.8 , 4.3 , 6.6};
		System.out.println(Arrays.toString(myArray6));
		
		String [] myArray7 = new String[3];
		myArray7[0] = "amazon";
		myArray7[1] = "facebook";
		myArray7[2] = "tesla";
		System.out.println(Arrays.toString(myArray7));
		
		boolean [] myArray8 = {true,false,true,};
		System.out.println(Arrays.toString(myArray8));
	}

}
