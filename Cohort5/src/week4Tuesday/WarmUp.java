package week4Tuesday;

public class WarmUp {

	public static void main(String[] args) {
		
		// Loop : Executing some codes repetitively
		
		// 0,2,4
		for (int i = 0; i < 5; i = i +2) {
			//System.out.println(i+ " Hello World");
		}
		
		// Create a program which finds sum of the numbers 1-100
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i; // sum += i
		}
		
		System.out.println(sum);
		
		// Create a string variable which holds all even numbers from 0 - 50
		
		String allEvens = "";
		
		for (int i = 0; i < 50; i++) {
			if(i%2==0)
			allEvens = allEvens + i +" ";
		}
		
		System.out.println(allEvens);
		
		
		// How to find reverse of a string
		String school = "Silicone Labs";
		
		for (int i = 0; i < school.length(); i++) {
			//System.out.print(school.charAt(school.length()-i-1));
		}
		
		for (int i = school.length() - 1; i >= 0; i--) {
			System.out.print(school.charAt(i));
		}

	}

}
