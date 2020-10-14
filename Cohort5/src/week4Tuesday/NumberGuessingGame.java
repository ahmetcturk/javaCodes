package week4Tuesday;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Count on how many times we played the game
		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100 + 1); // 0-1
		int userGuess;
		int counter = 0;
		do {
			System.out.println("Guess a number : ");
			userGuess = scanner.nextInt();
			counter ++;
			if (userGuess > randomNumber) {
				System.out.println("Too high");
			} else if (userGuess < randomNumber) {
				System.out.println("Too low");
			} else {
				System.out.println("Congratulations, you guessed it " + counter + " times");
			}
		} while (userGuess != randomNumber);

		
	}

}
