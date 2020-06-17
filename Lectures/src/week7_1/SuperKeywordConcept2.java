package week7_1;

//Parent class or Superclass
class SuperClass {
	int num = 100;
}

// Child class or subclass
class ChildClass extends SuperClass {
	/*
	 * I am declaring the same variable num in child class too.
	 */
	int num = 110;

	void printNumber() {
		System.out.println(num); // It will print value 110
		System.out.println(super.num); // It will print value 100
	}

	
}

public class SuperKeywordConcept2 {

	public static void main(String args[]) {
		ChildClass obj = new ChildClass();
		obj.printNumber();
	}

}
