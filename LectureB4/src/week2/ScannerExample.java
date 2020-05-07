package week2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		// Scanner object
		Scanner scanner = new Scanner(System.in);// scanner name is identifier
		
		System.out.println("Please enter your name : ");
		
		// Taking String value from user
		String name  = scanner.nextLine(); // nextline is creating a scanner in console
		System.out.println("Your name is : " + name);
		
		
		// Taking integer value from user
		System.out.println("Please enter your age : ");
		int age = scanner.nextInt(); // nextInt is creating a scanner in the console
		System.out.println("Your age is  : " + age);

		// Taking double value from user
		System.out.println("Please enter your height : ");
		double height = scanner.nextDouble();
		System.out.println("You heigt is : " + height + " meter");
		
		// Taking a char from user
		System.out.println("Please enter a character : ");
		char myChar = scanner.next().charAt(0);
		System.out.println("This is the character that you put: " + myChar);
		
		
		
	}

}
