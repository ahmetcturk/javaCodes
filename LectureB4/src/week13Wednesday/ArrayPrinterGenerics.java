package week13Wednesday;

import java.util.Iterator;

public class ArrayPrinterGenerics {

	
	static <E> void printArray(E[] inputArray){	
		for (E element :inputArray) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
	// Create a generic method which prints different data type array's elements int[], String[]

		Integer arr [] = {1,2,3,4};
		String arr1 [] = {"String", "Java"};
		
		printArray(arr);
		printArray(arr1);
		
	}

}
