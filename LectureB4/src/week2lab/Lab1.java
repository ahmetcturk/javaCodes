package week2lab;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one number : ");
		int num1 = input.nextInt();
		System.out.println("Enter another number : ");
		int num2 = input.nextInt();
		System.out.println("Enter an operator : ");
		char operator = input.next().charAt(0);
		
		if (operator == '+') {
			System.out.println(num1 + num2);
		}
		else if (operator == '-') {
			System.out.println(num1 - num2);
		}
		else if (operator == '/') {
			System.out.println((double)num1 / num2);
		}
		else if (operator == '*') {
			System.out.println(num1 * num2);
		}
		else {
			System.out.println("invalid operator");
		}
		

	}

}
