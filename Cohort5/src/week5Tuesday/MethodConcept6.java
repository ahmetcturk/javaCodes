package week5Tuesday;

import java.util.Scanner;

public class MethodConcept6 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MethodConcept6 object = new MethodConcept6();
		
		System.out.println("What is your limit : ");
		int limit = scanner.nextInt();
		
		object.printNumbers(limit); // Take the limit number as an argument

		// printWords(String word, int repeat)
	}

	// Create a method which prints method from 1-10
	void printNumbers(int limit){
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
		}
	}
	
}
