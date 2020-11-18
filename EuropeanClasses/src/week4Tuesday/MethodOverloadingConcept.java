package week4Tuesday;

public class MethodOverloadingConcept {
	
	
	// Method Overloading : creating methods with same name but different parameters
	public static void main(String[] args) {
		System.out.println(addition(22,33,99));
	}
	
	static int addition(int a, int b){
		return a+b;
	}
	// Overloading the addition method
	static int addition(int a, int b, int c){
		return a+b+c;
	}

}
