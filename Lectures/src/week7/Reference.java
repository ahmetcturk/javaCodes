package week7;


public class Reference {
	public static void main(String[] args) {
		
		SuperClass object1 = new SubClass();
		// This object can access super class fields and methods and overridden methods from Subclass
		object1.overridenMethod();
		object1.superClassField = 10;
		object1.superClassMethod();
		
		SuperClass object2 = new SuperClass();
		object2.overridenMethod();
		
	}
}

class SuperClass{
	int superClassField;
	void superClassMethod(){
		System.out.println("SuperClass method");
	}
	void overridenMethod(){
		System.out.println("Hello from Super Class");
	}
}
class SubClass extends SuperClass{
	int subClassField;
	void overridenMethod(){
		System.out.println("Hello From Subclass");
	}
	void subClassMethod(){
		System.out.println("SubClass Method");
	}
}
