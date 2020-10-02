package week2Thursday;

import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your grade : ");

		char grade = scanner.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good Job");
			break;
		case 'C':
			System.out.println("Well Done");
			break;
		case 'D':
			System.out.println("You passed");
			break;
		case 'F':
			System.out.println("You Failed");
			break;
		default:
			System.out.println("Invalid Grade");
			break;
		}
	}

}
