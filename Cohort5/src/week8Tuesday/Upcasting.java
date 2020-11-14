package week8Tuesday;

// Upcasting : Creating superclass reference with subclass object

class SuperClass{
	int superClassField = 10;
	
	void superClassMethod(){
		System.out.println("Super class method");
	}
	void overridenMethod(){
		System.out.println("Overriding method in superclass");
	}
}

class SubClass extends SuperClass{
	int subClassField = 8;
	void overridenMethod(){
		System.out.println("Overriding method in subclass");
	}
	void subClassMethod(){
		System.out.println("Subclass Method");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		// Upcasted objects has access to superclass field and methods except overriden methods
		// Overriden methods comes from subclass
		SuperClass reference = new SubClass();
		System.out.println(reference.superClassField);
		reference.superClassMethod();
		reference.overridenMethod();
		
		reference = new SuperClass();
		reference.superClassMethod();
		

	}

}
