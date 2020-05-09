package week2lab;

import java.util.Scanner;

import week2.IfBlocks;

public class Lab2 {

	public static void main(String[] args) {
		
		// If all sides are equal, that's a equilateral
		// If only two sides are equal, that's a isosceles
		// If ever side is different, that's a Scalene
		Scanner scanner = new Scanner( System.in);
		System.out.println("Enter side 1 : ");
		int side1 = scanner.nextInt();
		System.out.println("Enter side 2 : ");
		int side2 = scanner.nextInt();
		System.out.println("Enter side 3 : ");
		int side3 = scanner.nextInt();
		
		if (side1 == side2 && side1==side3){
			System.out.println("equilateral");
		}
		
		else if (side1 == side2 || side1==side3 || side2==side3){
			System.out.println("isosceles");
		}
		
		else {
			System.out.println("Scalene");
		}
		
		
	}

}
