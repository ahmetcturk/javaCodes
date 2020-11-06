package week7Thursday;


class SuperClass{
	int superClassField;

	public SuperClass(int superClassField) {
		this.superClassField = superClassField;
		System.out.println("This is superclass constructor");
	}

	
}
class SubClass extends SuperClass{

	// Super Keyword for invoking super class constructor
	public SubClass(int superClassField) {
		super(superClassField); // needs to be first statement
		System.out.println("Hello");
	}
	
}

public class SuperKeywordConcept1 {

	public static void main(String[] args) {
		SubClass subClass = new SubClass(9);
		System.out.println(subClass.superClassField);
	}

}
