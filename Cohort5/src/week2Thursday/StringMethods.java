package week2Thursday;

public class StringMethods {

	public static void main(String[] args) {
		
	// Primitive Data Types : int , char, double, float, byte, short, long, boolean
	// Non-Primitive Data Types : String, 
		int a = 90;
		
		
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
		// toUpperCase()
		String name = "Ahmet";
		System.out.println(name.toUpperCase());
		
		//toLowerCase()
		String lastName = "TURK";
		System.out.println(lastName.toLowerCase());
		
		// length()
		System.out.println("Silicone Labs".length());
		String schoolName = "Silicone Labs";
		System.out.println(schoolName.length());

		// substring()
		//                 0123456789
		String computer = "MacBookPro";
		System.out.println(computer.substring(4));
		System.out.println(computer.substring(2,6));
		String newString = computer.substring(0,3) + computer.substring(7,10);
		System.out.println(newString);
		
		// charAt(int);
		//                 0123456789
		String username = "ahmetcanturk";
		System.out.println(username.charAt(3));
		System.out.println(username.toUpperCase().charAt(1));
		
		
		// equals(string)
		String user1 = "ahmetcanturk";
		String user2 = "ahmetcanturk";
		
		System.out.println(user1.equals(user2));
		boolean variable = user1.equals(user2);
		
		//contains()
		String string1 = "Java Programming Language";
		System.out.println(string1.contains("A"));
		
		//indexOf()
		System.out.println(string1.indexOf('X'));
		//replace()
		System.out.println(string1.replace('J', 'L'));
		System.out.println(string1.replace("Programming", "Gaming"));
		//concat()
		System.out.println(user1.concat(user2)); // user1 + user2
		// Do one example of these methods and share on the #peertopeer 
		
		
		
		
		
		
	}

}
