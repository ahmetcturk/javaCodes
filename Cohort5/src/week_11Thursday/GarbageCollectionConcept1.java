package week_11Thursday;

public class GarbageCollectionConcept1 {
	
	@Override
	protected void finalize() throws Throwable { // finalize method runs everytime GC is working
		// TODO Auto-generated method stub
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {
		
		// 1) Assigning object reference to null
		GarbageCollectionConcept1 obj = new GarbageCollectionConcept1();
		obj = null;
		
		// 2) Anonymous object 
		new GarbageCollectionConcept1();
		
		// 3) Assigning references to each other
		GarbageCollectionConcept1 obj2 = new GarbageCollectionConcept1();
		obj2 = obj;
		
		System.gc(); // It is not guaranteed to execute
		

	}

}
