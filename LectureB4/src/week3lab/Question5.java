package week3lab;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// next() method can take one word as input
		// nextLine() can take whole line as input
		String sentence = scan.nextLine();
		String word = scan.nextLine();
		
		// If word1 contains word2, we will have true value
		// in a boolean variable
		
		boolean value = sentence.contains(word);
		System.out.println(value);

		
	}

}
