package week6Thursday;

import java.util.Arrays;
import java.util.Scanner;

public class Person {

	public static int[] deleteElement(int[] intArray, int element) {
		int[] intArrayNew = new int[intArray.length - 1];
		int k = 0;
		int t = 0;
		for (int i : intArray) {
			if (i == element) {
				t = 1;
			}
		}
		if (t == 1) {
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] == element) {
					continue;
				}
				intArrayNew[k++] = intArray[i];
			}
			return intArrayNew;
		}
		return intArray;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(array1));
		System.out.println("Enter the number which will be removed: ");
		int number = input.nextInt();
		System.out.println(Arrays.toString(deleteElement(array1, number)));
}
	
}
