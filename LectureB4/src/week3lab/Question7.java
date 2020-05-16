package week3lab;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 String word1 = scan.next();
		 String word2 = scan.next();

		 // Concatenate the strings +, concat()
		 System.out.println(word1.concat(word2).concat(word2).concat(word1));
	}

}
