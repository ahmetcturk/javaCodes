package week6;

// This example demonstrates constructor concept
// Instantiation : Creating object
public class CellPhone {

	// Fields
	
	String brand;
	int price;
	
	// constructor : it is a special block which instantiate the objects
	// Constructors consist of access modifiers and Class name
	// accessModifiers Classname(Parameter List){}
	// If we don't create a constructor, java creates a default one with no parameter 
	public CellPhone(String a, int b){ 
		brand = a;
		price = b;
	}
	
	public CellPhone() {
	}
	public static void main(String[] args) {
		
	//  Class name reference    Constructor
		CellPhone object1 = new CellPhone("Apple", 1000);
		
		System.out.println(object1.brand + "\n" + object1.price);
		
		CellPhone object2 = new CellPhone();

	}

}
