package week3;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		// What is array ? 
		// Array is a variable that can hold multiple values
		// Values inside of the array called elements
		int number = 12;
		
		// In order to hold multiple values in our variable, we need to create array
		// We can create arrays in any data type
		// Lowest index number is 0
		// Highest index number is (length of the array - 1)
		// 1st way to create array
		int [] agesOfCustomers = {30,25,50,19,28};
		
		System.out.println(agesOfCustomers[4]);
		//System.out.println(agesOfCustomers[10]);-- ArrayIndexOutOfBound Exception
		
		// 2nd way to create array
		int [] balanceOfCustomers = new int[] {1000,2000,9000};
		
		// 3rd way to create array
		// Number inside of the [] represent length of the array
		// Default values of the string array is null(empty)
		String [] nameOfCustomers = new String[4];
		nameOfCustomers[0] = "John";
		nameOfCustomers[1] = "Fiona";
		nameOfCustomers[2]= "Wayne";
		nameOfCustomers[3]= "Ahmet";
		//nameOfCustomers[4]= "Ahmet";
		//nameOfCustomers[1] = "George";
		System.out.println(nameOfCustomers[1]);
		
		System.out.println(nameOfCustomers[2]);
		
		// length of the array
		// length is not method, it is variable
		System.out.println(nameOfCustomers.length);
		
		// How to print all list 
		System.out.println(Arrays.toString(nameOfCustomers));
		
		
		// boolean array
		boolean [] booleanArray = {true,false,(3>8), (true && false)};
		System.out.println(Arrays.toString(booleanArray));
		
		// boolean arrays holding false value by default
		boolean []booleanArray2 = new boolean [2];
		System.out.println(booleanArray2[0]);
		
		// double type array
		double [] doubleArray = {6.45,7.9,9,0,0.0};
		
		// printing array with for each loop
		for (double elements : doubleArray) {
			System.out.print(elements+ " ");
		}
		System.out.println();
		// print it with for each loop
		boolean [] booleanArray3 = {true,false,(3>8), (true && false)};
		for (boolean elements : booleanArray3) {
			System.out.print(elements + " ");
		}
		
		
		
	}

}
