package lambdaExpressions;


// Functional Interface
interface SquareRoot {
	
abstract double findSquareRoot(int n);

}

public class Lambda_3 {

	public static void main(String[] args) {
		
		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		System.out.println(squareRoot.findSquareRoot(4));
		
		SquareRoot squareRoot1 = (n) -> {
			double result = Math.sqrt(n);
			return result;
			};
			System.out.println(squareRoot1.findSquareRoot(4));
			
	}
	
	private static double squareRootJava8LambdaAsArgument(int i) {
		
		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		return displayData(squareRoot, i);
		}
		private static double displayData(SquareRoot squareRoot, int i) {
		return squareRoot.findSquareRoot(9);
		}

}
