package week6a;

public class ObjectConcept {

	String string;
	
	public ObjectConcept(String aString ) {
		string = aString;
	}
	
	String getString(){
		return string;
	}
	
	public static void main(String[] args) {
		
		ObjectConcept reference;
		reference = new ObjectConcept("Java");
		System.out.println(reference.getString());
		
		// Anonymous Object
		// Why we need anonymous object : If we want to use the object only one time, we can create this
		
		System.out.println(new ObjectConcept("Object concept field").getString());
		
		

		
		
	}

}
