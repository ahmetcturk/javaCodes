package week5;

import javax.management.monitor.CounterMonitorMBean;

// Question : Can we overload the main method 
// Answer : Yes we can

public class Example {
	// Create a method which finds the biggest numbers among two given numbers
	// findTheMax(8,5) --> 8
	
	
	
	// "ahmet Can Turk"
	// countTheLetter("ahmet Can Turk", "a") --> 2
	public static void main(String[] args) {
		System.out.println(findTheMax(4, 6));
		
		countTheLetter("I love Java language, it is pretty easyaaaaaaaaaa", 'a');
		
	}
	
	static void countTheLetter(String string , char ch ){
		int count = 0;
		
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
	
	
	
	
	
	// Overloaded main method
	public static void main() {

	}

	
	static int findTheMax(int a, int b){
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	
}
