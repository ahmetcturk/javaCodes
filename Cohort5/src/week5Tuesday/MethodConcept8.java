package week5Tuesday;

import java.util.Scanner;

public class MethodConcept8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the operator : ");
		String operator = scanner.next();
		
		System.out.println("What is number 1 : ");
		int number1 = scanner.nextInt();
		
		System.out.println("What is number 2 : ");
		int number2 = scanner.nextInt();
		
		new MethodConcept8().calculator(operator, number1, number2 );
	}

	// Create a method which takes operator and calculate numbers, use Scanner

	// calculator(String operator, int number1, int number2)
	// calculator("+", 9, 8) --> 17
	// calculator("*", 10, 8) --> 80

	void calculator(String operator, int number1, int number2) {
		switch (operator) {
		case "+":
			System.out.println(number1 + number2);
			break;
		case "-":
			System.out.println(number1 - number2);
			break;
		case "*":
			System.out.println(number1 * number2);
			break;
		case "/":
			System.out.println((double)number1 / (double)number2);
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
