package classConcept;

//There can be only one public class per source file.
//A source file can have multiple non-public classes.

class myClass {
	// Fields - Attributes
	int x;
	String y;

	// Constructor is a special method which has same name with class
	// We are using constructor in order to initialize the object
	// Even if you don't declare constructor, java creates one default
	// constructor which has no parameters
	public myClass(int x, String y) {
		System.out.println("Constructor has been triggered");
		System.out.println("******************************");
		this.x = x;
		this.y = y;
	}

	// No parameter constructor
	public myClass() {
		System.out.println("No Parameter Constructor has been triggered");
		System.out.println("******************************");
	}

}

public class ClassConcept1 {

	public static void main(String[] args) {
		// Object for myClass Class
		myClass myObj = new myClass(10, "Songs"); // when creating object,
													// constructor is being
													// triggered
		System.out.println("These datas initialized by constructor -->" + myObj.x + " " + myObj.y);

		// Object 2 for myClass Class
		myClass myObj2 = new myClass();
		myObj2.x = 12;
		myObj2.y = "Giant Mens";
		System.out.println("These datas initialized outside of the constructor-->" + myObj2.x + " " + myObj2.y);

	}

}
