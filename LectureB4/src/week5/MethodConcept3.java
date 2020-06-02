package week5;

public class MethodConcept3 {

	public static void main(String[] args) {
		
		MethodConcept3 object = new MethodConcept3();
		System.out.println(object.method(5));
		
		// How to call method with anonymous object
		// Optional example
		System.out.println(new MethodConcept3().method(2));
	}
	
	String method(int i){
		if (i == 1) {
			return "First";
		}
		else if (i == 2) {
			return "Second";
		}
		else {
			return "Not first or second";
		}
	}

}
