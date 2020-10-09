package week2Thursday;

public class SwitchCaseExample3 {

	public static void main(String[] args) {

		// Challenge : Create a simple calculator with switch case statements
		// +,-,/,*

		double number1 = 9;
		double number2 = 10;

		char operator = '-';

		switch (operator) {
		case '+':
			System.out.println(number1 + number2);
			break;
		case '-':
			System.out.println(number1 - number2);
			break;
		case '/':
			System.out.println(number1 / number2);
			break;
		case '*':
			System.out.println(number1 * number2);
			break;

		default:
			System.out.println("Invalid Operator");
			break;
		}

	}

}
