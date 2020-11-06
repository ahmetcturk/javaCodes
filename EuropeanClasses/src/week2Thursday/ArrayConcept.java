package week2Thursday;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*
		 * + What is array ?
		 * - Array is variable that can store more than one value
		 */
		// First way to create array
		//               0 1 2 3
		int []numbers = {9,4,5,6};
		
		System.out.println(numbers[0] +"" + numbers[1]);
		
		// Arrays.toString(arrayname) : Prints all the elements of the array
		System.out.println(Arrays.toString(numbers));
		
		// Length of the array
		System.out.println(numbers.length);
		
		// String Array
		String []names = {"John", "Wayne", "Mel", "Gibson"};
		System.out.println(Arrays.toString(names));
		System.out.println(names[0]);// --> Memory Location
		
		// Second way to create array
		// Formula : DataType [] arrayName = new DataType[size]
		int [] numbers2 = new int[3];
		numbers2[0] = 90; 
		numbers2[1] = 99;
		numbers2[2] = 100;
		System.out.println(Arrays.toString(numbers2));
		
		
		// Third Way to create array
		// DataType [] arrayName = new DataType[]{element1,element2...}
		int [] nums = new int[]{1,2,3,4,5};
		
		
		// How to store all kinds of DataTypes in array
		Object []objects = {"String",3,4.4,56f,99,true,false, 9==8, 'A'};
		System.out.println(Arrays.toString(objects));
		
		// Boolean Array
		boolean [] booleans = {"Ahmet".equals("Ahmed"), true, 9<0, "Java".contains("va")};
		System.out.println(Arrays.toString(booleans));
		
		

	}

}
