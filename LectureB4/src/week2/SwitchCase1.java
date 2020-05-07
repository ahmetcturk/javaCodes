package week2;

public class SwitchCase1 {

	public static void main(String[] args) {

		int weather = 9;

		switch (weather) {
		case 0:
			System.out.println("This is a sunny day");
			break;
		case 88:
			System.out.println("It's raining today");
			break;
		case -90:
			System.out.println("It's cloudy today");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
