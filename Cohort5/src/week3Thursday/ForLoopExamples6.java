package week3Thursday;

import java.util.Scanner;

public class ForLoopExamples6 {

	public static void main(String[] args) {
		
		// Find the factorial of the numbers
		// 5! = 5*4*3*2*1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int number = scanner.nextInt();
		int factorial =1;
		for(int i = 1; i<=number; i++ ){
			factorial = factorial * i;
		}
		System.out.println(factorial);
		
		
		

	}

}
