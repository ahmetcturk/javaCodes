package week_12Tuesday;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GenericMethods3 {
	
	static <E> String[] convertString(E[] inputArray){
		String arr[] = new String[inputArray.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ""+inputArray[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// Create a generic method that accepts generic array. 
		// returns the content of the array inside of a string array
		// {1,2,3} -> {"1", "2", "3"}
		// {42.98,42.99,43.00} -> {"42.98", "42.99", "43.00"}
		Integer arr[] = {1,2,3,4};
		System.out.println(Arrays.toString(convertString(arr)));
		System.out.println(convertString(arr)[0] + " element");

	}

}
