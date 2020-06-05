package week3Lab;

public class Question3 {

	public static void main(String[] args) {
		//Question 3
			
		int[] myArray = { 10, 20, 30, 55, 60, 70, 90, 100 };

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] == 100) {
				System.out.println("Value found at index " + i);
				break;
			} else {
				System.out.println("100 not found in the array");

			}
		}

	}

}
