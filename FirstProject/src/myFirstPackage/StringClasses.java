package myFirstPackage;

public class StringClasses {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
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
		
		// length()
		String name = "Ahmet Can Turk";
		System.out.println(name.length());
		System.out.println("Silicone Labs".length());
		
		// toUpperCase()
		String string1 = "Hello World";
		System.out.println(string1.toUpperCase());
		System.out.println("Hello World".toUpperCase());
		
		// toLowerCase()
		String string2 = "I love Java";
		System.out.println(string2.toLowerCase());
		System.out.println("I LovE JaVa".toLowerCase());
		
		// substring()
		String string3 = "Java Standard Edition";
		System.out.println(string3.substring(2, 9));
		System.out.println("Integrated Development Kit".substring(0,4));
		System.out.println(string3.substring(5));
		
		// charAt()
		String string4 = "Java Standard Edition";
		System.out.println(string4.charAt(5));
		System.out.println(string4.charAt(0));
		System.out.println("Java Standard Edition".charAt(7));
		
		// equals()
		String string5 = "Eclipse";
		System.out.println(string5.equals("Eclipse"));
		System.out.println("eclipse".equals("Eclipse"));
		
		// equalsIgnoreCase()
		String string6 = "Ahmet";
		System.out.println(string6.equalsIgnoreCase("AHMET"));
		System.out.println("ahmet".equalsIgnoreCase("AhmET"));
		
		// contains()
		String string7 = "John";
		System.out.println(string7.contains("x")); // false
		System.out.println(string7.contains("J"));// true
		
		// indexOf()
		String string8 = "Wayne";
		System.out.println(string8.indexOf('a'));
		System.out.println("HollyWood".indexOf('d'));
		
		// replace()
		String string9  = "Java";
		System.out.println(string9.replace('J', 'L').replace('v', 'p').charAt(2));
		
		//concat()
		String string10 = "Hello";
		String string11 = " ";
		String string12 = "World";
		
		System.out.println(string10.concat(string12)); // HelloWorld
		System.out.println(string10.concat(string11).concat(string12)); // Hello World
		// Go over to the exam topics
		// Take some question from java exam questions
		
		
	}

}
