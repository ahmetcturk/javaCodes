package week6Tuesday;
// This example demonstrates 3 ways to initialize the objects
public class InitializeObjects {

	int a; 
	double b; 

	public InitializeObjects(int a, double b) {
		this.a = a;
		this.b = b;
	}

	public InitializeObjects() {
	}

	void changeA(int a){
		this.a = a;
	}

	public static void main(String[] args) {
		InitializeObjects ref1 = new InitializeObjects();
		// Initialize fields with direct access
		ref1.a = 100;
		ref1.b = 42.98;
		
		// Create constructor and initialize the fields with that
		InitializeObjects ref2 = new InitializeObjects(9, 99);
		
		// Use method to change the field
		ref2.changeA(900);
		System.out.println(ref2.a);
		
		
		

	}

}
