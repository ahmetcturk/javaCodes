package week3lab;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		// There are two options, we will use 2 blocks
		
		// Equals method is the best option to check equalities of Strings
		
		if (word1.equals(word2)) {
			System.out.println("Word1 equals word2");
		}
		else{
			System.out.println("Word1 does not equal to word2");
		}
		

	}

}
