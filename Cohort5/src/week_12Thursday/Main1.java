package week_12Thursday;

import week_11Thursday.Main;

public class Main1 {
	static int digit(double number){
		int digit = 0;
		for (int i = (int)number; number >0; number/=10) {
			digit++;
		}
		return digit;
	}
	
	public static void main(String[] args) {
		
		double dividend = 900;
		double divisor = 3;
		int result = 0;
		
		for (int i = 0; i < digit(dividend); i++) {
			double number = dividend / (int)Math.pow(10, digit(dividend)-i);
			if (number/ divisor >= 1) {
				result = (int)(number/divisor);
				
			}
			else {
				
				result = (int)(10*number/divisor);
			}
		}
		
		System.out.println(result);

	}
	

	
}
