package week13Wednesday;

public class VariableArguments {

	// Create a method that can recieve unlimited amount of int variable
	
	static void method(String... a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		
		method("1");
		method("2");
		method("3");
	
	
	}

}
