package inheritanceConcept;
// Subclass will inherit all the properties (except private properties) from Superclass
// Inheritance only works in one way. Properties will inherit from superclass to subclass
// But Properties won't be inherited from subclass to superclass.

class Superclass{
	private int x;
	String y ;
	void method(){
		System.out.println("This is method in superclass");
	}
}

class Subclass extends Superclass{
	int a ;
	String b;
	void method1(){
		// System.out.println(x);//-- Private properties are not accessible from subclasses
	}
}

public class InheritanceConcept1 {

	public static void main(String[] args) {
		Superclass superclass = new Superclass();
		//superclass.x =10;
		Subclass subclass = new Subclass();
		//subclass.x = 100;
		subclass.method();
		superclass.method();
		// Superclass object doesn't have access to subclass properties
		//superclass.a = 100;//--compiler error
	}

}
