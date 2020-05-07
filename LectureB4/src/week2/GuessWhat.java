package week2;

import java.util.Scanner;


public class GuessWhat {

	public static void main(String[] args) {
		
		int pin = 432000000;
		int hackedPin = 0;
		GuessWhat obj = new GuessWhat();
		boolean check = true;
		while (check) {
			int number = obj.RandomNumberGenerator();
			while ((number == pin)) {
				
				hackedPin = number;
				check = false;
				break;
			}
			
		}
		System.out.println(hackedPin);
	}
	
	public  int RandomNumberGenerator(){
		int random = (int)(Math.random()*1000000000); 
		
		return random;
	}

}
