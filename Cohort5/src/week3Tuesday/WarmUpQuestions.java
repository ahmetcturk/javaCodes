package week3Tuesday;

public class WarmUpQuestions {

	public static void main(String[] args) {
		
		// Create a program which prints the last character of a string
		//             012345
		String word = "Silicone Lab";
		System.out.println(word.length());
		System.out.println(word.charAt(word.length()-1));
		
		// Create a program which finds if number is even or odd
		
		// Even : 0,2,4,6,8,10
		// Odd : 1,3,5,7,9
		int number = 0;
		if(number % 2 == 1){
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		
		
		
	}

}
