package week11;

public class GCConcept {
	// Garbage means unreferenced objects
	public static void main(String[] args) {
		// 3 ways to be eligible for Garbage Collection
		
		// Nulling the reference
		GCConcept s1 = new GCConcept(); // object will be collected by GC
		s1 = null;
		
		
		// Assigning references to each other
		GCConcept s2 = new GCConcept();
		GCConcept s3 = new GCConcept();
		s2 = s3;
		
		// Anonymous Objects
		new GCConcept();
		
		// More Examples.. 
		Integer num = new Integer(99); // Garbage
		num  = new Integer(4298); // Garbage
		
		System.out.println(num);
		
		num = null; 

	}

}
