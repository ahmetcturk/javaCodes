package week_11Recap;

@FunctionalInterface
interface LambdaExample{
	void calculatePower (int base, int power);
}


public class LambdaExpressions1 {

	public static void main(String[] args) {
		// Create a lambda expression for this method
		// 5^2 = 25
		// 5^3 = 125
		// 2^5 = 32
		
		LambdaExample lambdaExample = (a, b) ->{
			int power = (int)Math.pow(a, b);
			System.out.println(power);
			
		};
		
		lambdaExample.calculatePower(5, 3);
		
		
		
	}

}
