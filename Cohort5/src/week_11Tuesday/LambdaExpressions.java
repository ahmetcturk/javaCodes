package week_11Tuesday;

// In order to use lambda expression, we need to have functional interface
// Functional interface : Interface which have only one abstract method

@FunctionalInterface
interface FunctInterface{
	void abstractFunc(String x);
}

@FunctionalInterface
interface Square{
	void square(int x);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// We are implementing abstractFunc method with lambda expression
		FunctInterface reference = (String x) -> System.out.println(x);
		reference.abstractFunc("Hello World");
		
		Square reference2 = (x) -> System.out.println(x * x);
		reference2.square(9);
		
	}

}
