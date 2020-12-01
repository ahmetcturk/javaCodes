package week4Thursday;


public class NonStaticMethod1 {
	 
	public static void main(String[] args) {
		//         reference  
		//           ^         OBJECT 
		//  Scanner input = new Scanner(System.in);
		
		NonStaticMethod1 reference1 = new NonStaticMethod1();
		reference1.printMessage("Ahmet");
		reference1.printNumber(5);
		int number = reference1.returnNumber(9);
		System.out.println(number);// 9
		System.out.println(reference1.returnNumber(10));
		
		int []numbers = {45,67,88,99};
		reference1.printArray(numbers);
		
	}
	
	// Challenge, create a method which prints the element of the arrays, call it from main method
	void printArray(int [] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	int returnNumber(int a){
		return a;
	}
	
	void printNumber(int limit){
		// This method will print number until the given limit
		for (int i = 0; i <= limit; i++) {
			System.out.println(i);
		}
	}
	
	public void printMessage(String message){
		System.out.println(message);
	}
	
	

}
