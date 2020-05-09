package week2lab;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Senior Citizens");
		int seniorCitizens, nonSeniorCitizens, age;
		seniorCitizens =scanner.nextInt();
		System.out.println("Enter the number of Non-Senior Citizens");
		nonSeniorCitizens =scanner.nextInt();
		System.out.println("Enter the age : ");
		age = scanner.nextInt();
		
		if (age>=65) {
			System.out.println(seniorCitizens);
			seniorCitizens++; // seniorCitizens = seniorCitizens + 1
		} else {
			System.out.println(nonSeniorCitizens);
			nonSeniorCitizens++; //  nonSeniorCitizens= nonSeniorCitizens + 1
		}
		System.out.println("New seniorCitizens count " + seniorCitizens);
		System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
	}

}
