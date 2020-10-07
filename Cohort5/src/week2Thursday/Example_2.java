package week2Thursday;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		// Challenge : Ask a year of birth from user and calculate the age of
		// the user
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("What is your age : ");
		
		int age = keyboard.nextInt();
		
		System.out.println("Your age is : " + age);
		
		
		System.out.println("What is your name : ");
		
		String name = keyboard.next();
		
		System.out.println("Your name is : " + name);
		

	}

}
