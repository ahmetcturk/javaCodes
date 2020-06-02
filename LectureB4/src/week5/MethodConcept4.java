package week5;

public class MethodConcept4 {

	public static void main(String[] args) {
		MethodConcept4 object  = new MethodConcept4();
		object.age(1990);
		System.out.println(object.method());
	}
	
	// Create a method which calculates age of the person with Year of birth
	// Parameter is Year of Birth
	// Return type is void
	// Method will print age of the person
	
	void age(int year){
		System.out.println(2020-year);
	}

	String method(){
		System.out.println("Hello");
		return"";
	}
}
