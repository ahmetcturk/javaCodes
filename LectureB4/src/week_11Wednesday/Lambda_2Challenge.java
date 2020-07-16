package week_11Wednesday;

@FunctionalInterface
interface SquareRoot{
	double squareRoot(double a);
}


public class Lambda_2Challenge {

	// Create a Func. interface, double squareRoot(double a), 
	// Implement it with lamda expression, print the result in console
	// Sample input : 81, output : 9
	// 
	
	public static void main(String[] args) {
		
		SquareRoot reference = (n) -> (Math.sqrt(n));
		
		System.out.println(reference.squareRoot(9));
		
		SquareRoot reference2 = (n) -> {double result = Math.sqrt(n);
										return result;
										};
			System.out.println(squareRootLambda(reference,256));
	}
	
	// Lambda expression as parameter
	private static double squareRootLambda(SquareRoot reference, int x){
		return reference.squareRoot(x);
	}
	


}
