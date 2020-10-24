package week5Lab;

public class Question3 {
	
	
	public static void main(String[] args) {
		sumOfDigits(999);
		System.out.println(sumOfTheDigits(987));
	}
	
	static int sumOfTheDigits(int n){
		
		int result = 0;
				
				while(n > 0) {
					result += n % 10;
					n /= 10;
				}
		return result;	

	}
	

	
	static void sumOfDigits(int n){
		
		int result = 0;
				
				while(n > 0) {
					result += n % 10;
					n /= 10;
				}
		System.out.println(result);

	}
}
