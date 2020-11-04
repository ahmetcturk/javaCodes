package week2Tuesday;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		// Create a program which determines if a number is positive or negative or 0
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number : ");
		
		int number = input.nextInt();
		
		if (number>0) {
			System.out.println("number is positive");
		} 
		else if (number < 0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("number is 0");
		}
		
		
		
		
		
	}

}
