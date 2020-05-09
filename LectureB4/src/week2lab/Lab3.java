package week2lab;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number betweeen 1-5");
		int key = scanner.nextInt();

		switch (key) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid Number");
		}

	}

}
