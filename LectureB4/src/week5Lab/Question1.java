package week5Lab;

public class Question1 {
	
	
	public static void arrayPrinter(int[] arrayParameter) {

		for (int i = 0; i < arrayParameter.length; i++) {
			System.out.println(arrayParameter[i]);
		}

	}

	public static void main(String[] args) {
		int[] arrayArgument = { 9, 8, 7, 6, 5, 4, 3,5,6,7,8 };
		arrayPrinter(arrayArgument);

	}

}
