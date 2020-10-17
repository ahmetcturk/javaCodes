package week4Lab;

public class Question4 {

	public static void main(String[] args) {

		
		int[] nums = { 100, 234, 311, 5433, 6454, 1233, 54523, 45645, 1234 };
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (nums[i]%2==0) {
				sumOfEvens = sumOfEvens + nums[i];
			} else {
				sumOfOdds = sumOfOdds + nums[i];
			}
		}
		
		System.out.println("Sum of even numbers : " + sumOfEvens);
		System.out.println("Sum of odd numbers : " + sumOfOdds);
		System.out.println("Sum of all numbers : " + sum);

	}

}
