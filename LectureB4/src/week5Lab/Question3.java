package week5Lab;

public class Question3 {

	public static void main(String[] args) {
		
		findSumInt(8890);
		findSumInt(8810);
		findSumInt(8490);
		
		findTheSumInt(9999);
	}
	static void findTheSumInt(int n) {

		int result = 0;

		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		System.out.println(result);
		

	}
	static int findSumInt(int n) {

		int result = 0;

		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		System.out.println(result);
		return result;

	}
}
