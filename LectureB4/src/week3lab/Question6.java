package week3lab;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();

		// First char and last char of the string
		// Ahmet = last index is 4, length is 5
		char first = word1.charAt(0);
		char second = word1.charAt(word1.length()-1);
		System.out.println(first +""+ second);
		
	}

}
