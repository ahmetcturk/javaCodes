package week3Tuesday;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		// Split method is a method inside of String class
		// Split method creates String array from a string
		String arr [] = "Ahmet Can/Turk".split("/");
		
		System.out.println(Arrays.toString(arr));
		
		// Create a program which checks the string and print the words that start with A
		String string = "Ahmet Can is the Java teacher in Quality Assurance Engineering School";
		
		String words[] = string.split(" ");
		
		for (String string2 : words) {
			if (string2.startsWith("A")) {
				System.out.println(string2);
			}
		}
		
		
		

	}

}
