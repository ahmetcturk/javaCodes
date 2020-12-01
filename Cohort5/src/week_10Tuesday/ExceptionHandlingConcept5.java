package week_10Tuesday;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import week2Tuesday.ScannerExample;

public class ExceptionHandlingConcept5 {
	// Throws keyword : declaration of exception in method header
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello");
		Thread.sleep(3000);
		System.out.println("World");
		method();
		
	}
	static void method() throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextInt());
		
	}
}
