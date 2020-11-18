package week4Tuesday;

public class MethodConcept1 {

	// static returnType methodName(parameter){ return value}
	
		//
		static int method1(int x){
			return x + 100;
		}
		
		static double method2(double a, int b){
			return a + b;
		}
		
	public static void main(String[] args) {
		
		int number = method1(90);
		System.out.println(number);
		System.out.println(method2(9.6, 9));
		
		System.out.println(findAge(1990));
		
		
	}
	
	static int findAge(int birthYear){
		int age = 2020 - birthYear;
		return age;
	}

}
