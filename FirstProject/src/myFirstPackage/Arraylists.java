package myFirstPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylists {
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// Arraylists are dynamic arrays in Java
		// First difference : Arraylists can hold different data types
		// Second difference : Arrays are fixed size, but arraylists are not.
		// we are adding value with add method
		 
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add(90); // integer
		arrayList.add("String"); // string
		arrayList.add(true); // boolean
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.remove(1); // removes index number 1
		System.out.println(arrayList);
		
		
		// Declaring the Arraylist in one statement
		
		ArrayList arrayList2 = new ArrayList<>(Arrays.asList("Eclipse", 4,6,'o',0,true));
		arrayList2.add(false); // adding to the end of the list
		System.out.println(arrayList2);
		
		// Generic Arraylists : They are going to hold one kind of data type
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Java");
		names.add("5");
		names.add("This is a string");
		System.out.println(names);
		
		
		ArrayList<Double> arrayList3 = new ArrayList<>();
		arrayList3.add(90.8);
		
		ArrayList<Byte> arrayList4 = new ArrayList<>();
		arrayList4.add((byte)126);
		
		ArrayList<Integer> age = new ArrayList<>();
		age.add(8);
		age.add(6);
		age.add(12);
		System.out.println("This is the ages arraylist " + age );
		// add a value to specific index number, size increases
		age.add(2, 99);
		System.out.println("This is the ages arraylist " + age );
		
		age.add(4, 10);
		System.out.println("This is the ages arraylist " + age );
		
		age.add(5, 10);
		System.out.println("This is the ages arraylist " + age );
		
		// set (), changes the value in specific index number, size stays same
		age.set(4, 98);
		System.out.println("This is the ages arraylist " + age );
		
		// size(), returns the number of element in Arraylist
		System.out.println("This is the size of the arraylist : " + age.size());
		System.out.println("This is the highest index number in arraylist : " + (age.size()-1));
	}
}
