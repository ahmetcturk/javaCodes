package week9Tuesday;

import java.util.Arrays;

public class InterfaceConcept5 {

	// +Can an interface have a constructor
	// - No
	
	// +Can we reassign the value(global variable) of the interface 
	// - No because they are final by default
	
	// + Can we declare an interface with an abstract keyword
	// - Yes, it is optional
	
	// + Can we override an interface method with visibility other than public ? 
	// - No
	
	// + Can an interface extend a class ? 
	// - No
	
	// + Can an interface have any method other than abstract method ? 
	// After Java, yes
	
	// Can interfaces have main method ? 
	// Yes
	
	public static void main(String[] args) {
		x.main(args);
		
	}

}
interface x{
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}


