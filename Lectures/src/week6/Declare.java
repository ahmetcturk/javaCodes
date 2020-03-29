package week6;

public class Declare {
	
// I would like to find how many objects has been created from this class
	static int counter;
	
	public Declare() {
		counter++;
	}
	public static void main(String[] args) {
		// Declaring objects in different ways
		
		// Creating object reference
		Declare object1 = new Declare();
		
		// Anonymous Objects, this is a good approach when we need to use object only one time
		new Declare();
		new Declare().method();
		
		// Creating multiple object in one statement
		Declare object2 = new Declare(), object3 = new Declare(), object4 = new Declare()
				, object5 = new Declare(),object6 = new Declare();
		System.out.println(counter);
	}
	
	void method(){
		System.out.println("Method");
	}

}
