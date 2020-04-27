package PreBootCamp;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean myBoolean = true;
		boolean myBoolean1 = false;
		
		// && - Logical And
		// If one of the sides are false, then whole expression is going to be false
		// Otherwise, expression is going to be true (if both sides are true)
		
		System.out.println(myBoolean && myBoolean1); // Output : False
		System.out.println(myBoolean1 && myBoolean1); // Output : False
		System.out.println(myBoolean && myBoolean); // Output : True
		System.out.println(myBoolean1 && myBoolean); // Output : False
		
		// || - Logical Or
		System.out.println(true || true); // Output : True
		System.out.println(false || true); // Output : True
		System.out.println(true || false); // Output : True
		System.out.println(false || false); // Output : False
		
		
		System.out.println(6>9 || 8<9); // Output : True

	}

}
