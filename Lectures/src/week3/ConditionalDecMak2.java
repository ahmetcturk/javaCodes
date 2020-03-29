package week3;

import java.util.Scanner;
import java.util.*;

public class ConditionalDecMak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Everyone !");
		// 1) only one block is going to work
		// 2)first true condition block is going to work 
		// if no condition is true, else is going to work
		// else block doesn't have condition
		int x = 90;
		
		if (false) {
			x = 100;
		}
		else if (9 == 8 || 6<9) {
			x = 102;
		}
		else{
			x = 101;
		}
		
		System.out.println(x);
		// Difference between switch-case and if-else
		//1) i have option to execute the codes in different blocks
		//2) instead of conditions, switch case blocks use value equality
		int y = 8; // key 
		
		switch (y){ // y = key
		case 1 : // value = 1
			System.out.println("This is case 1");
			break;
		case 2 : // value = 2
			System.out.println("This is case 2");
			break;
		case 3 : // value = 3
			System.out.println("This is case 3");
			break;
		default: // 
			//System.out.println("No values were equal to keys");
		}
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is the day : ");
//		String key = scanner.nextLine();
//		switch (key) {
//		case "monday":
//			System.out.println("This is monday");
//			//break;
//		case "tuesday":
//			System.out.println("This is tuesday");
//			//break;
//		case "wednesday":
//			System.out.println("This is wednesday");
//			//break;
//
//		default:
//			System.out.println("This is not the first 3 days of the week");
//			
//		}
		
		
		char charKey = 'Y';
		switch (charKey) {
		case 'Z':
			System.out.println("Key is Z");
			
		case 'Y':
			System.out.println("Key is Y");
			
		case 'A':
			System.out.println("Key is A");
			break;

		default:
			System.out.println("This is the default");
			
		}
		
		int age = 10;
		int [] arr = {4,6,5,2,3,7,8};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 2,3,4,5,6,7,8
		System.out.println(Arrays.toString(arr));
		// binary search method is giving an index number after sorting the value
		System.out.println(Arrays.binarySearch(arr, 4)); //2
		
		String arr1[] = {"Java", "Eclipse", "Slack", "Homework"};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1, "Slack"));
		
		// Arraylist
		ArrayList arrayList = new ArrayList();
		// First difference : Arraylists can hold different data types
		// Second difference : Arrays are fixed size, but arraylists are not.
		// we are adding value with add method
		arrayList.add(90);
		arrayList.add("Java");
		arrayList.add(true);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.remove(2);
		System.out.println(arrayList);
		
		// Declaring arraylist in one statement
		ArrayList numbers = new ArrayList<>(Arrays.asList("Eclipse" , 4, 6, 'o', 0 ,90));
		numbers.add(9);
		System.out.println(numbers);
		
		int arr3 [] = new int[1]; // this is a fixed size array
		arr3[0] = 90;
		//arr3[1] = 10;
		arr = arr3;
		
		// Generic Arraylists : They are going to hold one kind of data type
		ArrayList<String> names = new ArrayList<>();
		names.add("Java");
		names.add("5");
		names.add("This is a string");
		System.out.println(names);
		
		
		ArrayList<Double> ages1 = new ArrayList<>();
		ages1.add(90.0);
		
		ArrayList<Byte> ages2 = new ArrayList<>();
		ages2.add((byte) 1);
		
		ArrayList<Integer> ages = new ArrayList<>();
		ages.add(8);
		ages.add(9);
		ages.add(10);
		System.out.println("This is the ages arraylist : " + ages);
		ages.add(2, 99);
		System.out.println("This is the ages arraylist : " + ages);
		ages.set(0, 18); // set method is changing the number in the target index
		System.out.println("This is the ages arraylist : " + ages);
		System.out.println("This is the size of the arraylist  : " + ages.size());
		System.out.println("This is the highest index number of the arraylist  : " +( ages.size()-1));
		
		// Another way to declare string
		char [] arrsample = {'S','i','l','i','c','o','n','e'};
		String string = new String(arrsample);
		System.out.println(string);
		
		int [] intArray = {1,2,3,4,5};
		System.out.println(intArray.length);
		String intArrayString = Arrays.toString(intArray); // 
		System.out.println(Arrays.toString(intArray)); // this is a method to print the array elements
		System.out.println(intArrayString);
		// To be continued : in next class we will learn how to print array elements in numeric value
		
		
		String string1 = "   string  77  ";
		string1.trim(); // trim method is erasing the spaces at the end and begining of the string
		System.out.println(string1);
		//System.out.println(string1.substring(3,9) + string1.substring(11,14));
		
		String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split("@",3);  // split methods splits the strings and creates arrays out of strings
        System.out.println(Arrays.toString(arrOfStr));
		
        //Remove & (and)Print only YeshivaUniversity
        String uni = "HarvardUniversity&YeshivaUniversity&Rutgers&OhioState";
       // uni = uni.substring(18,35);
        
        System.out.println(uni.replaceAll(uni,"YeshivaUniversity"));
        
        String []arr2 = uni.split("&",4); 
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[3]);
        
       /* Write assignment statements that perform the following operations with the variables a, b, and c.
        a. Adds 2 to a and stores the result in b	      
        b. Multiplies b times 4 and stores the result in a
        c. Divides a by 3.14 and stores the result in b      
        d. Subtracts 8 from b and stores the result in a 
        e. Stores the character ‘K’ in c		      
        f. Stores the Unicode code for ‘B’ in c
        */
        
        double a=0;
        double b = a +2;
        a = b*4;
        b= a/3.14;
        a = b-4;
        char c = 'K';
        c = (int)'B';
        
        
        
        
        
	}

}