package week2;

import java.util.*;

public class StringMethods2 {
ArrayList list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Good Evening Silicone Labs!");
		
		String username = "acturk";
				
		boolean myVariable = username.equals("acturK");
		
		if (myVariable) { // switch lamp
		System.out.println("if block");	
		}
		else {
		System.out.println("else block");	
		}
	
		System.out.println("Good Evening Silicone Labs again !");
		
		
		
		int num1 = 0; // 0 is not a negative or a positive number
		// Create a program which finds if number is negative or positive
		if(num1 > 0){
			System.out.println("Your number is Positive");
		}
		else if(num1 == 0){
			System.out.println("Your number is zero");
		}
		else{
			System.out.println("Your number is negative");
		}
		
		
		
		// checks my grade and finds the equivilant letter grade
		// 90-100, A
		// 80- 90, B
		// 70 -80, C
		// 60 - 70, D
		// 0 - 60, F 
		
		// Question : If grade above 100, print("invalid grade")
		// if your grade is negative print("invalid grade")
		int grade = 100;// 0-100
		if (grade > 100) {
			System.out.println("Invalid Number");
		} 
		else if (grade > 90) {
			System.out.println("A");
		} 
		else if (grade > 80){
			System.out.println("B");
		}
		else if (grade > 70) {
			System.out.println("C");
		}
		else if (grade > 60) {
			System.out.println("D");
		}
		else if (grade >= 0) {
			System.out.println("F");
		}
		else {
			System.out.println("Invalid Number");
		}
	
		
		
		// in order to donate blood, you need to be over 50 kg, and older than 18 yrs
		int age = 15;
		int weight = 50;
		
		if (age > 18) {
			if (weight > 50) {
				System.out.println("You can donate blood!");
			} else {
				System.out.println("You need to be over 50 kg");
			}
		} 
		else if (age < 18 && weight<60){
			System.out.println("Your age and your weight is not enough");
		}
		
		else {
			System.out.println("You need to be older than 18");
		}
		
		// Interview Question
		// Extract the numbers out of the string
		
		String string = "::::::hjfkufuviu6r ytf uf ugyu";
		// replaceAll
		string = string.replaceAll("", "");
		System.out.println(string);
		
		
		// StringBuilder
		StringBuilder stringBuilder = new StringBuilder("This is a string ");
		// append method is concatinating two string
		stringBuilder.append("builder ! ");
		System.out.println(stringBuilder);
		stringBuilder.setCharAt(0, 'L'); 
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse());
		

		
		
		
}
	
}
