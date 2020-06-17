package week7;
// Subclass will inherit all the properties(except private properties)from superclass
// Inheritance only works in one way. 
// Properties will be inherited from superclass to subclass

// Single Inheritance
class SuperClass{
	private int x;
	String yString;
	void SCMethod(){
		System.out.println("This is method in superclass !");
	}
}

class SubClass extends SuperClass{
	int a;
	String b;
	void SUBMethod(){
		System.out.println("This is method in subclass !");
	}
	void SUBMethod2(){
		System.out.println(a + "\n" + b + "\n" +yString);
		SCMethod();
	}
}

// public classes needs their own file
public class InheritanceConcept1 {

	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		//subClass.x = 9;// x is not reachable with subclass object
		SuperClass superClass = new SuperClass();
		// superClass.SUBMethod();//SUBMethod is not reachable with superclass obj
		subClass.SUBMethod2();

	}

}
