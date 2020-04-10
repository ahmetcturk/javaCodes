package week10;

public class ExceptionHandlingConcept4 {

	public static void main(String[] args) {

		// Nested try - catch blocks

		try {
			System.out.println(9 / 0);
			try {
				System.out.println(9 / 0);
				try {
					int[] myNumbers = { 1, 2, 3 };
					System.out.println(myNumbers[10]);
				} catch (StringIndexOutOfBoundsException e) {
					System.out.println("StringIndexOutOfBoundsException handled");
				}
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception Handled");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out");
		}

	}

}
