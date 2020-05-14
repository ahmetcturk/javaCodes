package week3;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String string = "I love Java";
		String string2 = "     I love selenium     ";
		
		// Trim method - Trim method is trimming extra spaces from begining and
		// from end of the string

		System.out.println(string2);
		System.out.println(string2.trim());
		
		String s2 = "Your total amount is 1500 USD";
		System.out.println(s2.substring(21,25));
		System.out.println(s2.substring(21,s2.indexOf("USD")-1));
		System.out.println(s2.indexOf("USD")-1);
		
		//Split()
		String language = "Java-Python-C++-C";
		String stringArray [] = language.split("-");
		System.out.println(Arrays.toString(stringArray));
		
		// endsWith()
		String string3 = "Ahmet";
		System.out.println(string3.endsWith("t"));
	}

}
