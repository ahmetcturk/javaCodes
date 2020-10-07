package week2Thursday;

public class Example {

	public static void main(String[] args) {
		//             01234
		String word = "Ahmet";
		boolean variable = false;
		if(variable){
		System.out.println(word.toUpperCase());
		System.out.println(word.concat(" Can"));
		}
		else if (!variable) {
			System.out.println("Else if");
		}
		else{
		System.out.println(word.indexOf('A'));
		System.out.println(word.substring(0, 3));
		}
		
		
		int number = 0;
		if (number > 0) {
			System.out.println("Positive");
		}
		else if (number ==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
		
		// Citizen
		
		int age = 19;
		
		if(age > 18){
			System.out.println("You can vote");
		}
		else {
			System.out.println("You can not vote");
		}
		
		
	}

}
