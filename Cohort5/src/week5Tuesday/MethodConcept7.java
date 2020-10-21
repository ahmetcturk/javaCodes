package week5Tuesday;

import java.util.Scanner;

public class MethodConcept7 {

	public static void main(String[] args) {
		
		// printWords(String word, int repeat)
		Scanner scanner = new Scanner( System.in);
		System.out.println("What is the word : ");
		String word = scanner.next();
		
		System.out.println("How many times do you want to print");
		int repeat = scanner.nextInt();
	
		new MethodConcept7().printWords(word, repeat);
		
		
	}
	
	// Challenge, create a method which print words in specific numbers
	void printWords(String word, int repeat){
		for (int i = 0; i < repeat; i++) {
			System.out.println(word);
		}
	}

}
