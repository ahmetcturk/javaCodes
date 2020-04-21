package inheritanceConcept;

class Superclass{
	int x;
	String y;
	void method(){
		System.out.println("This is a superclass method");
	}
	private void method2(){
		System.out.println("This is a private superclass method");
	}
}
// Subclass will inherit all the properties (except private properties) from Superclass
class Subclass extends Superclass{
	int a;
	String b;
	void subclassMethod(){
		System.out.println("This is a subclass method");
	}
}

public class InheritanceConcept1 {

	public static void main(String[] args) {
		Subclass subclassObject = new Subclass();
		subclassObject.x = 10; // x has been inherited from superclass to subclass
		subclassObject.y = "String"; // y has been inherited from superclass to subclass
		subclassObject.method();// method has been inherited from superclass to subclass
		subclassObject.a = 100;
		subclassObject.b = "String1";
		subclassObject.subclassMethod();
		//subclassObject.method2();//-- Compiler error
	}

}
