package week2Thursday;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcept3 {

	public static void main(String[] args) {
		
		// Create a program which can assign the values to array with Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		//int number = scanner.nextInt();
		
		int[] numbers = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
		System.out.println(Arrays.toString(numbers));
		

	}

}
