package week2lab;

import java.awt.event.KeyEvent;
import java.net.Inet4Address;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int age1 = input.nextInt();
		System.out.println("Enter number 2 : ");
		int age2 = input.nextInt();
		System.out.println("Enter number 3 : ");
		int age3 = input.nextInt();
		
		if (age1>age2 && age1>age3) {
			System.out.println(age1);
		}
		else if (age2>age1 && age2 > age3) {
			System.out.println(age2);
		}
		else if (age3 > age1 && age3 > age2){
			System.out.println(age3);
		}
		else if (age1 == age2 && age1 == age3) {
			System.out.println("All the numbers are same");
		}
		
	}

}
