package week3lab;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();

		int lenght1 = word1.length();
		int length2 = word2.length();
		
		// 3 options, 
		if (lenght1 > length2) {
			System.out.println(word1);
		}
		else if (lenght1<length2) {
			System.out.println(word2);
		}
		else {
			System.out.println("Both are equal");
		}
		
	}

}
