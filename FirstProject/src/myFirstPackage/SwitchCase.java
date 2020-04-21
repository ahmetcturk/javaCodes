package myFirstPackage;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !

		// let's remember how if else blocks were working
		// 1) only one block is going to work
		// 2)first true condition block is going to work
		// if no condition is true, else is going to work
		// else block doesn't have condition

		int x = 90;

		if (true) {
			x = 100;
		} else if (9 == 8 || 6 < 9) {
			x = 102;
		} else {
			x = 101;
		}

		// System.out.println(x);

		// Difference between switch case and if-else statements
		// 1 ) i have option to execute the codes in different blocks
		// 2 ) instead of conditions, switch case block use key-value equality
		// key can be int, char or string

		// Cases are starting to execute from the first equal case to all the
		// way down until default
		// break keyword is killing(stops) the switch case execution
		char charKey = 'c';

		switch (charKey) {
		case 'b':
			System.out.println("Case 1");
			break;
		case 'a':
			System.out.println("Case 2");
			break;
		default:
			// System.out.println("Default");

		}

		// we can put as many case as we want to the program
		int intKey = 7;

		switch (intKey) {
		case 4:
			System.out.println("Case 1");
			break;
		case 7:
			System.out.println("Case 2");
			break;

		default:
			System.out.println("Default");// no values were equal to the key
			break;
		}

		// Let's create a Switch case program,
		// This program will ask the user for number between 1-7
		// Depending on the number, different name of the days will appear in
		// console

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the number of the day : ");
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
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}

	}

}
