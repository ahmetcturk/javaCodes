package week11;

public class GarbageCollectionConcept {
	String obj_name;
	public GarbageCollectionConcept(String name) {
		obj_name = name;
	}
	
	public static void main(String[] args) {
	GarbageCollectionConcept object1 = new GarbageCollectionConcept("t1");
	GarbageCollectionConcept object2 = new GarbageCollectionConcept("t2");
	// Reassigning the references
	object1 = object2;
	
	
	// Null references
	GarbageCollectionConcept object3 = new GarbageCollectionConcept("t3");
	object3 = null;
	
	
	// Anonymous Objects
	new GarbageCollectionConcept("t4");
	System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name);
	}
}

