package lambdaExpressions;

interface AClass{

abstract String sayHello();
}

interface BClass{
	int sum(int a, int b);
}

public class Lambda_4 {

	public static void main(String[] args) {
		
		AClass lambda = () -> ("Hello");
		
		System.out.println(lambda.sayHello());
		
		BClass lambda1 = (a,b) -> (a+b);
		
		
		
		
	}

}
