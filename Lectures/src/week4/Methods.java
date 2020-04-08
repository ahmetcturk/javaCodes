package week4;

import java.util.Arrays;

public class Methods {

	public static void printOut(String print){
		System.out.println(print + " so much");
	}
	
	public static void addNumbers(int a, int b, int c){
		int addition = a + b + c;
		System.out.println(addition);
	}
	
	public static void areaOfTriangle(int height, int base){
		System.out.println((height*base)/2);
	}
	
	public static void printArray(int [] source){
		System.out.println(Arrays.toString(source)); // printing values of the array
	} 
	
	public static void printArray(String [] source){ // Overloading of the printArray Method
		System.out.println(Arrays.toString(source)); // printing values of the array
	} 
	
	
	public static void helloWorld(){
		System.out.println("HelloWorld");
		System.out.println("Hello Silicone Labs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloWorld(); // calling hello world method
		printOut("I love Java");
		addNumbers(1, 2, 3);
		int [] arr = {1,2,3,4};
		int [] arr1 = {5,6,7,8,9};
		String [] names = {"ahmet", "Huseyin", "Ilhan"};
		printArray(arr); // arr = 1,2,3,4
		printArray(arr1);
		printArray(names);
	
		areaOfTriangle(3, 5);
		areaOfTriangle(3, 10);
		

	}


}
