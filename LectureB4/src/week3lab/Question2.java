package week3lab;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age<0) {
			System.out.println("Invalid Age");
		}
		else if (age<2) {
			System.out.println("ineligible");
		}
		else if (age==2) {
			System.out.println("toddler");
		}
		else if (age<6) {
			System.out.println("early childhood");
		}
		else if (age<8) { // (age>=6 && age<=7)
			System.out.println("young reader");
		}
		else if (age<11) {
			System.out.println("elementary");
		}
		else if (age<13) {
			System.out.println("middle");
		}	
		else if (age==13) {
			System.out.println("impossible");
		}
		else if (age<17) {
			System.out.println("high school");
		}
		else if (age<19) {
			System.out.println("scholar");
		}
		else {
			System.out.println("ineligible");
		}
		
	}

}
