package week5Lab;

public class Question5 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,4};
		findDuplicate(arr);

	}

	static void findDuplicate(int [] arr) {

		System.out.println("Finding duplicate elements in array using brute force method");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// got the duplicate element
					System.out.println(arr[j]);
				}
			}
		}

	}

}
