package week8Tuesday;

public class OverloadingConcept {
// Overloading : Creating more than one method in the same class with different parameters
// in order to achieve flexibility in our algorithm 
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		new OverloadingConcept().arrayPrinter(arr);
		
		String [] strArr = {"Selenium", "Java", "Jenkins"};
		
		new OverloadingConcept().arrayPrinter(strArr);
		
		int number = add(9, 8);
		
	}
	
	 void arrayPrinter(String [] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	 void arrayPrinter(int [] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static int add(int a, int b){
		return a+ b;
	}
	
	static void add(int a, int b, int c){
		System.out.println(a + b + c);
	}

}
