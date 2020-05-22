package week4;

import org.omg.Messaging.SyncScopeHelper;

public class Recab1 {

	public static void main(String[] args) {
	
		// For Loop
		
		int num = 6;
		for(;num < 100; num *= 3){ // num *= 3 expression is same with num = num * 3
			System.out.println(num);
		}
		
		
		// Uppercase Alphabet, We are storing characters inside of a string variable
		String upperCase = ""; // A-Z
		
		for (char character = 'A'; character <= 'Z'; character++) {
			upperCase = upperCase+character;
			
		}
		
		System.out.println(upperCase);
		
		
		// Lowercase Alphabet. we printing characters
		
		for (char character = 'a'; character <= 'z'; character++) {
			
			System.out.print(character);
			
		}
		
		
		
		
		
		
	}

}
