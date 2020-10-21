package week5Tuesday;

public class MethodOverloadingConcept {
	// Method overloading : using the same method name with different parameters
	public static void main(String[] args) {
		
		new MethodOverloadingConcept().print(9); //
//		new MethodOverloadingConcept().print("Nine");
//		new MethodOverloadingConcept().print(9,7);

	}
	
	void print(int number){
		System.out.println("Number : " + number);
	}
	
	void print(int number, int number2){
		System.out.println("Number : " + number);
		System.out.println("Number 2 : " + number2);
	}
	
	void print(String word){
		System.out.println("Word : " + word);
	}

}
