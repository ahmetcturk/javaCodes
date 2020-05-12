package week3;

public class StringMethods {

	public static void main(String[] args) {
		
		// This is how we are using methods(functions) in classes
		// String classes has different methods
		String string = "Silicone Labs";
		System.out.println(string.length());
		
		/*
	  	length() // finds the length of string
		toUpperCase() // makes your letters all uppercase
		toLowerCase() // makes your letters all lowercase
		substring() // Extract substring from string
		charAt() // returns a single character at a specified location
		equals() // compare if two string is identical
		contains() --> finds if target string contains what is provided
		indexOf() --> Giving index number of specific character
		replace() --> Replace method replaces certain characters in a string
		concat() ---> Concatenation - writing strings side by side
		*/

		// toUpperCase()
		String string1 = "Hello World";
		System.out.println(string1.toUpperCase());
		System.out.println("Hello World!".toUpperCase());
		
		// toLowerCase()
		String string2 = "Ahmet Can Turk";
		System.out.println(string2.toLowerCase());
		System.out.println("JAVA".toLowerCase());
		System.out.println("Java".toLowerCase().toUpperCase());
		
		// substring()
		String string3 = "I love Java !";
		System.out.println(string3.substring(2,9));
		String string4 = string3.substring(0,9);
		System.out.println(string4);
		System.out.println(string3.substring(4));
		
		// charAt()
		String string5 = "Java Standard Edition";
		System.out.println(string5.charAt(7));
		
		// equals()
		String string6 = "Eclipse";
		String string7 = "Selenium";
		System.out.println(string6.equals(string7));
		
		// equalsIgnoreCase()
		String string8 = "Ahmet";
		String string9 = "AhmeT";
		System.out.println(string8.equalsIgnoreCase(string9));
		
		// contains () 
		String string10 = "Jo hn";
		System.out.println(string10.contains(" ")); // Space is a character
		
		// indexOf()
		String string11 = "Wayne";
		// When this expression returns negative number
		// That means, target char doesn't exist
		System.out.println(string11.indexOf('0'));
		
		// replace()
		String string12 = "Java";
		System.out.println(string12.replace('j', 'L').replace('v', 'p'));
		
		// concat() - concatenation
		System.out.println(string10 + string11);
		System.out.println(string12.concat(string11).concat(string10));
	}

}
