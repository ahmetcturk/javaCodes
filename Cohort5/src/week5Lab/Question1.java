package week5Lab;

import java.util.Arrays;

public class Question1 {

	public static void arrayPrinter(int[] arrayParameter) {
		//System.out.println(Arrays.toString(arrayParameter));
//		for (int i : arrayParameter) {
//			System.out.println(i);
//		}
		
		for (int i = 0; i < arrayParameter.length; i++) {
			System.out.println(arrayParameter[i]);
		}

	}

	public static void main(String[] args) {
		int[] arrayArgument = { 9, 8, 7, 6, 5, 4, 3 };
		arrayPrinter(arrayArgument);

	}

}
