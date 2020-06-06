package week5Lab;

// Methods for code reusability
public class Example {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };

		int[] arr2 = { 1, 2, 3, 4, 5 };

		int[] arr3 = { 1, 2, 3, 4, 8, 5, 5 };
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		

	}
	
	static void printArray(int[]arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
