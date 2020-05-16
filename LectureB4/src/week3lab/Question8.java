package week3lab;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		// Ahmet  (5/2 = 2)
		
		int lentghOfWord = word.length();
		if (lentghOfWord>= 5 && (lentghOfWord%2)==1) {
		 System.out.println("" + word.charAt(word.length()/2-1) + word.charAt(word.length()/2)
		 + word.charAt(word.length()/2 +1));
		}
		else {
			System.out.println("Invalid");
		}

	}

}
