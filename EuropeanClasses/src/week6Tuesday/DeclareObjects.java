package week6Tuesday;

public class DeclareObjects {
	
	int a ; 
	
	
	public static void main(String[] args) {
		// First way to create object, assigning reference to the object
		DeclareObjects reference1 = new DeclareObjects();
		
		// Second Way to create object, creating more than one object in single statement
		DeclareObjects reference2 = new DeclareObjects(), reference3 = new DeclareObjects(),
				reference4 = new DeclareObjects();
		
		// Third way to create object, Anonymous objects (no reference)
		// We can use only one time
		 new DeclareObjects();	
		 new DeclareObjects().method();
		 
	}
	
	void method(){
		System.out.println("Method");
	}
	

}
