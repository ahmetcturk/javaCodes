package PreBootCamp;


public class IfElseExamples {

	public static void main(String[] args) {
		
		// We can use true or false in our conditions
		if (true) {
			System.out.println("First if block");
		}

		// We can use boolean variables in our conditions
		boolean check = true;
		if (!check) {
			System.out.println("Second if block");
		}
		
		
		// We can use combination of boolean expression in our condition
		if ((6>8 && 9<=5) || (6>3 && check) || (9>=9 || 7<0)) {
			System.out.println("Third if block");
		}
		
		// We can use variables in our condition
		int a = 9;
		int b = 10;
		
		if (a == b) {
			System.out.println("Fourth if block");
		}
		
		
		int c = 9;
		
		boolean check1 = true;
		
		if (check1) {
			c = 900;
			
		}
		System.out.println("This is c : " + c);
		
		
		// Nested if blocks
		
		int x = 9;
		int y = 10;
		
		if (x == 9) {
			System.out.println("First if condition is true");
			if (y == 10) {
				System.out.println("Both if conditions are true");
			}
		}
		
		// ****************************
		// Java Certification Question
		String name = "Ahmet";
		String name1 = "Ahmet";
		
		
		if (name == name1) {
			System.out.println("First");
		}
		
		String name3= "Ahm";
		String name4 = "et";
		String name5 = name3 + name4;
		System.out.println(name5); //Ahmet
		if (name == name5) {
			System.out.println("Second");
		}
		
		if (name.equals(name5)) {
			System.out.println("third");
		}
	}

}
