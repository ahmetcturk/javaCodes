package week5Lab;

public class Question5 {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,5};
		findDuplicate(numbers);
	}

	static void findDuplicate(int [] numbers ) {
		
		System.out.println("Finding duplicate elements in array using brute force method");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i]==numbers[j]) {
					// got the duplicate element
					System.out.println(numbers[j]);
				}
			}
		}

		
	}
}
