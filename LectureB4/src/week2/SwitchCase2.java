package week2;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {

		// Grade of the student from user (A-B-C-D-F)

		Scanner input = new Scanner(System.in);
		System.out.println("What is the Grade of the student : ");
		String grade = input.next();
		switch (grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Very Good");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("You are smart but you need to study more");
			break;
		case "F":
			System.out.println("Try Again Next semester");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}

	}

}
