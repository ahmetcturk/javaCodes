package week1Lab;

import java.awt.geom.Area;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);	
		
//		System.out.println("How much ($) fuel does your car burn in one mile ?");
//		double cost_per_mile = scanner.nextDouble(); // nextLine taking string values
//		
//		System.out.println("How many miles did you drive ?");
//		int mile2 = scanner.nextInt(); // nextLine taking string values
//		
//		double cost = cost_per_mile * mile2;
//		System.out.println("Your cost is  : $" + cost);
//		// command + /
//		
//		// *******************************************
//		
//		System.out.println("Your weight : ");
//		double weight = scanner.nextDouble();
//		System.out.println("Your height  : ");
//		double height = scanner.nextDouble();
//		
//		double bmi = weight/(height*height) ; // body mass index
//		System.out.println("Your BMI is : " + bmi);
//		
		
//		System.out.println("Lastname : ");
//		String lastName = scanner.nextLine();
//		
//		System.out.println("Name : ");
//		String name = scanner.nextLine();
//		
//		System.out.println("Age : ");
//		String age = scanner.nextLine();
//		
//		System.out.println("State : ");
//		String state = scanner.nextLine();
//		
//		System.out.println("POB : ");
//		String POB = scanner.nextLine();
//		
//		System.out.println("License : ");
//		String licenseNumber = scanner.nextLine();
//		
//		
//		System.out.println("Lastname : " + lastName);
//		System.out.println("Name : " + name);
//		System.out.println("Age  : " + age);
//		System.out.println("State : " + state);
//		System.out.println("Place of Birth : " + POB);
//		System.out.println("License Number : " + "*************");
		
		System.out.println("Your name : ");
		String name = scanner.nextLine();
		System.out.println("Your Last name : ");
		System.out.println();
		String lastName = scanner.nextLine();
		System.out.println("Your Working Hours in a Month : ");
		int workingHours = scanner.nextInt();
		int hourRate = 42;
		double grossIncome = hourRate*workingHours;
		
		double taxAmount = grossIncome*0.1;
		double netIncome = grossIncome - taxAmount;
		System.out.println("Your net Income is : " + netIncome);
		System.out.println("Your net Gross is : " + grossIncome);
		
		
//		System.out.println("Radius");
//		double r = scanner.nextDouble();
//		double area = 3*r*r;
//		System.out.println("Area of the circle is : " + area);
		
		
		
		
	}

}
