package week_11Tuesday;

import java.lang.reflect.Method;

@FunctionalInterface
interface FuncInt2{
	int sum(int a, int b);
}

@FunctionalInterface
interface FunctInt3{
	double squareRoot(int a);
	default void Method(){
		System.out.println("Default");
	}
}

public class LambdaExpressions2 {

	public static void main(String[] args) {
		
		FuncInt2 reFuncInt2 = (a,b) -> (a+b);
		System.out.println(reFuncInt2.sum(9, 8));

		// Challenge
		// Create a functional interface and find the squareroot of the numbers
		FunctInt3 reFunctInt3 = (a) -> (Math.sqrt(a)) ;
		System.out.println(reFunctInt3.squareRoot(9));
		
		FunctInt3 reFunctInt4  = (a ) -> {double result = Math.sqrt(a); return result;};
		reFunctInt4.Method();
	}

}
