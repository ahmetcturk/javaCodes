package week8Tuesday;

class MyClass{
	// Encapsulation : making the fields private
	private int a;
	public MyClass(int a) {
		this.a = a;
	}
	
	void setA(int a){
		this.a = a;
	}
	
	int getA(){
		return a;
	}
}




public class MyClassTester {

	public static void main(String[] args) {
		
		// Assigning value with constructor
		MyClass ref = new MyClass(100);
		
		// Assigning value with reference
		// ref.a = 9; Comp Err, field is private
		
		// Assigning value with method
		ref.setA(9000);
		// System.out.println(ref.a); Comp Err, field is private
		
		// Get the value from another class
		System.out.println(ref.getA());

	}

}
