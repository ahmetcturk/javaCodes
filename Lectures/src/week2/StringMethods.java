package week2;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String name4 = "Ahmet"; // String char number (lenght of the string) = maxIndexNumber + 1 
		System.out.println(name4.length()); // maxIndexNumber + 1
		System.out.println(name4.charAt(0));
		
		
		
		// TODO Auto-generated method stub
		// Strings are non-primitive data types (Classes)
		String message = "Hello ";
		String message1 = "World";
		// Scanner scanner = new Scanner(System.in);
		String message2 = new String("Hello World !");
		
		// Concatenation - writing strings side by side
		System.out.println(message + message1); // OutPut : Hello World
		System.out.println(message.concat(message1)); // Hello World
		
		// toUpperCase methods
		System.out.println(message.toUpperCase());
		System.out.println("Ahmet".toUpperCase());
		// toLowerCase methods
		System.out.println(message2.toLowerCase());
		// length methods = number of character in a string
		System.out.println(message.length());
		// substring
		System.out.println(message2.substring(0,8)); // 0,8 are parameters
		System.out.println(message2.substring(0,8).charAt(6));
		System.out.println(message2.substring(0,8).toUpperCase().toLowerCase().toUpperCase());
	
		// charAt()
		System.out.println("Hello World".charAt(1));
		
		// equals() 
		String name = "java" ;
		String name2 = "Java";
		System.out.println(name.equals(name2));
		
		System.out.println("Java".equals(name));
		// equalsIgnoreCase(name2)
		System.out.println(name.equalsIgnoreCase(name2));
		
		// contains() methods 
		System.out.println("Ahmet".contains("v"));
				
		// indexOf() returns the index number specific character
		System.out.println("Selenium".indexOf("m"));
		
		// replace() 
		System.out.println("Java".replace("J", "L"));
		
		
		
		// dataType arrayName [] = new dataType [lengthOfArray]
		// first way to create arrays
		int myArray [] = new int [4];
		// default value is 0 for each index
		System.out.println(Arrays.toString(myArray));
		myArray[0] = 9;
		myArray[1] = 8;
		myArray[2] = 7;
		myArray[3] = 6;
		System.out.println(Arrays.toString(myArray));
		// second way to create arrays
		int myArray2[]  = new int []{4,5,6,7,9,8};
		System.out.println(Arrays.toString(myArray2));
		System.out.println(myArray2[0]);
		
		// third way to create arrays
		int [] myArray3 = {9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(myArray3));
		
		String [] myArray4 = {"Java", "Python" , "SQL" , "C++"};
		System.out.println(myArray4[1]);
		System.out.println(Arrays.toString(myArray4));
		
		double [] myDoubleArray = {9.8,9.9,8,10};
		System.out.println(Arrays.toString(myDoubleArray));
		
		String [] myStrings = new String[3];
		myStrings[0] = "Ahmet ";
		//myStrings [1] = "Can";
		System.out.println(Arrays.toString(myStrings));
		
		boolean [] myBooleanArray = {true,false};
		
		System.out.println(Arrays.toString(myBooleanArray));
		
		// Classname objectname = new Classname();
		


		
		
		String[] myStrings5=new String [4];
		 myStrings5[0]="Ahmet";
		 myStrings5[3] = "Java";
		
		System.out.println(Arrays.toString(myStrings5));
		
		
	
		
		
	}

}
