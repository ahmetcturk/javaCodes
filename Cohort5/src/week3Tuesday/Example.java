package week3Tuesday;

public class Example {

	public static void main(String[] args) {
		
		String name = "Silicone Labs";
		
		/*
		 *  length() // finds the length of string
			toUpperCase() // makes your letters all uppercase
			toLowerCase() // makes your letters all lowercase
			substring() // Extract substring from string
			charAt() // returns a single character at a specified location
			equals() // compare if two string is identicalC
			contains() --> finds if target string contains what is provided
			indexOf() --> Giving index number of specific character
			replace() --> Replace method replaces certain characters in a string
			concat() ---> Concatenation - writing strings side by side
		 */
		
		System.out.println(name.substring(4,11));
		String substring = name.substring(3, 8);
		System.out.println(substring);
		
		System.out.println(name.charAt(name.length()-1));
		
		System.out.println(name.equals(substring));
		
		System.out.println(name.contains("Labs"));
		
		System.out.println(name.indexOf('x'));
		
		String lastName = "Can";
		System.out.println("Ahmet".concat(lastName));
		
		System.out.println(lastName.toUpperCase().toLowerCase().substring(1));
		
		
		
		System.out.println("Java Programming Language".replace('a', 'z'));
		
		System.out.println("Java Programming Language".replace("Programming", "Functional"));
		
		
		
		
	}

}
