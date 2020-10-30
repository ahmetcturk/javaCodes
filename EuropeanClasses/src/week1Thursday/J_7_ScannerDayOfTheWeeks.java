package week1Thursday;

import java.util.Scanner;

public class J_7_ScannerDayOfTheWeeks {

	public static void main(String[] args) {
		
		
		// Write an if statement that will print the day of the weeks based on the value
		// of the day variable
		
		/*
		 * input : 1
		 * output : It's a monday
		 * 
		 * input : 7 
		 * output : It's a sunday
		 * 
		 * input : 9 
		 * output : There is no such a day
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		
		if (number == 1) {
			System.out.println("It's a monday");
		}
		else if (number == 2) {
			System.out.println("It's a tuesday");
		}
		else if (number == 3) {
			System.out.println("It's a wednesday");
		}
		else if (number == 4) {
			System.out.println("It's a thursday");
		}
		else if (number == 5) {
			System.out.println("It's a friday");
		}
		else if (number == 6) {
			System.out.println("It's a saturday");
		}
		else if (number == 7) {
			System.out.println("It's a sunday");
		}
		else {
			System.out.println("There is no such a day");
		}

	}

}
