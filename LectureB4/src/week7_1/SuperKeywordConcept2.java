package week7_1;

// Final Keywords;
// final variable = we can not update the variable
// final method = we can not override method
// final class = We can not extend to this class
// constructors can not be final

class SuperClass{
	int num = 4298;
	String name; 
}

class ChildClass extends SuperClass{
	int num = 4300;
	
	void printNumber(){
		// super class 
		System.out.println(num);// 4300
		System.out.println(new SuperClass().num); // 4298
		System.out.println(super.num); // 4298
		System.out.println(this.num); // 4300
		System.out.println(new ChildClass().num); // 4300
	}
}
public class SuperKeywordConcept2 {

	public static void main(String[] args) {
		
		new ChildClass().printNumber();

	}

}
