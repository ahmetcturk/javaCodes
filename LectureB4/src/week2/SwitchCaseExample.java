package week2;


public class SwitchCaseExample {

	public static void main(String[] args) {

		/*
		 * 1 ) In if else blocks, only one block will be executed, but in switch
		 * case statements, multiple block(case) can be executed 2 ) Switch case
		 * is only checking the equality between key and value but in if else
		 * blocks, we c an create complex boolean expressions Break Statemet :
		 * It kills the switch case flow
		 */

		// Key, value

		// Key : int, String, char

		int key = 90;

		switch (key) {

		case 100: // value = 1
			System.out.println("This is case 1");
			break;
		case 99: // value = 2
			System.out.println("This is case 2");
			break;
		case 3: // value = 3
			System.out.println("This is case 3");
			break;
		default:
			System.out.println("Default");

		}

		String name = "X Æ A-12";

		switch (name) {

		case "James":
			System.out.println("Robert's kid");
			break;
		case "X Æ A-12":
			System.out.println("Elon Musk's kid");
			break;
		case "Ahmet":
			System.out.println("Ihsan's kid");
			break;
		}

		// Create a simple calculator with switch case statements

		char operator = '/';

		double num1 = 9, num2 = 10;

		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;

			

		}

	}

}
