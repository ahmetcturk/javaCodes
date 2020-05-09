package week2lab;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		System.out.println("How many coupon did you win : ");
		// We prefer candies over gumball
		int coupon = scanner.nextInt();
		// one candy = 10 coupon
		int candies = coupon / 10;
		// one gumball = 3 coupon
		int gumball = (coupon%10)/3;
		
		int extraCoupons = coupon - (candies*10 + gumball*3);
		if (coupon<3) {
			System.out.println("Not enough coupon");
		} else {
			System.out.println("You can buy " + candies + " amount of candies");
			System.out.println("You can buy " + gumball + " amount of gumballs");
		}
		System.out.println(extraCoupons);

	}

}
