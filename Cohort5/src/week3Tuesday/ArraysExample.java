package week3Tuesday;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		// What is array ?
		// Arrays single variables that can hold multiple values
		// Values inside of the array called elements
		
		// 1st way to create an array
		//              0  1  2  3
		int[] number = {12,13,14,15,55,66};
		
		System.out.println(number[3]); // Print array elements by index number
		
		System.out.println(Arrays.toString(number));
		
		// length of the array
		int length = number.length;
		
		System.out.println(length);
		
		// 2nd way to create array
		int [] gradesOfTheStudents = new int [] {99,44,100,78};
		
		System.out.println(gradesOfTheStudents[2]);
		
		
		
		
		
		Object[] values = {1,2,"Ahmet", true, 9>9, 9.8};
		
		System.out.println(Arrays.toString(values));
		
		// 3rd way to create array
		
		String[] names = new String[3];
		
		names[0] = "Robert";
		names[1] = "John";
		names[2] = "James";
		names[0] = "Elon";
		System.out.println(Arrays.toString(names));
		
		// boolean array
		
		boolean[] booleanArray = {true,9>8, 0==1, 42!=98, true||false};
		
		System.out.println(Arrays.toString(booleanArray));
		
		// double array
		double [] doubleArray = {9.4 ,9.7 ,42.98};
		
		
		

	}

}
