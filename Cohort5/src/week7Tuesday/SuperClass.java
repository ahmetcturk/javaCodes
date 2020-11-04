package week7Tuesday;
// Subclass will inherit all the properties from superclass(except private ones)
// Inheritance works only one way, From super to sub
public class SuperClass {
	private int superClassVar;
	String lastname;
	void SCMethod(){
		System.out.println("This is method in superclass");
	}

}

class SubClass extends SuperClass {
	int subClassVar;
	String name;
	String lastname;
	void SubMethod(){
		System.out.println("This is method in subclass");
	}
	
	void SubMethod2(){
		System.out.println(lastname + "\n" + super.lastname);
		SCMethod();
	}
	
	
}