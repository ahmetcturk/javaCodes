package week2Tuesday;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StringMethods {

	public static void main(String[] args) {
		
		/*
	  	length() // finds the length of string
		toUpperCase() // makes your letters all uppercase
		toLowerCase() // makes your letters all lowercase
		substring() // Extract substring from string
		charAt() // returns a single character at a specified location-index
		equals() // compare if two string is identical
		contains() --> finds if target string contains what is provided
		indexOf() --> Giving index number of specific character
		replace() --> Replace method replaces certain characters in a string
		concat() ---> Concatenation - writing strings side by side
		*/
		// toUpperCase()
		String string = "Selenium";
		System.out.println(string.toUpperCase());
		System.out.println("Hello World".toUpperCase());
		
		// length()
		String string2 = "Silicone Labs";
		System.out.println(string2.length());
		int length = "Java 8".length();
		System.out.println(length);
		
		// toLowerCase()
		System.out.println("HELLO WORLD".toLowerCase());
		String string3 = string2.toLowerCase();
		System.out.println(string3);
		
		// charAt(int index)
		//                01234567
		String string4 = "Silicone";
		System.out.println(string4.charAt(7));
		char character = string4.charAt(5);
		System.out.println(character);
		
		
		// substring(int begining, int ending), substring(int begining)
		//                  012
		System.out.println("Hello World".substring(3));
		//                01234567
		String string5 = "Selenium";
		System.out.println(string5.substring(1, 5));
		
		// equals()
		String name1 = "Ahmet";
		String name2 = "AHMET";
		System.out.println(name1.equals(name2));
		boolean check = name1.equals(name2);
		System.out.println(check);
		
		// equalsIgnoreCase()
		boolean check2 = name1.equalsIgnoreCase(name2);
		System.out.println(check2);
		
		// contains()
		String string6 = "Jo hn";
		System.out.println(string6.contains(" "));//space is a character
		boolean variable = string6.contains("jo");
		System.out.println(variable);
		
		// indexOf(char character),indexOf(char character, int beginIndex)
		String string7 = "Postman API";
		System.out.println(string7.indexOf('P'));
		System.out.println(string7.indexOf('P', 2));
		
		// replace(int oldChar, int newChar)
		String string8 = "Java";
		System.out.println(string8.replace('J', 'L').replace('a', 'x'));
		
		System.out.println("Silicone Labs QA company".replace("company", "school"));
		
		// concat()
		System.out.println("Java 8".concat(" Standard Edition"));
		
		// endsWith(String string)
		System.out.println("Ahmet".endsWith("T"));
		
		// trim()
		String string9 = "    Java Classes   ";
		System.out.println(string9.trim());
		
		
		
		
		
		
		
		

	}

}
