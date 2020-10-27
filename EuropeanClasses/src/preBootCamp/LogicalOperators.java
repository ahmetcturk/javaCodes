package preBootCamp;

public class LogicalOperators {

	public static void main(String[] args) {
		// && : And : Returns true if all sides are true, otherwise returns false
		// || : Or  : Returns false if all sides are false, otherwise returns true
		boolean myBoolean1 = true;
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true &&true && true&&false); //false
		System.out.println(true && true && (true &&false)); //false
		System.out.println((9> 8) && (9<7) && myBoolean1); // false
		
		
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println(true ||false || false||false); //true
		System.out.println(true || true || (true ||false)); //true
		System.out.println((9> 8) || (9<7) && !myBoolean1); // false
		
		System.out.println((9==8) && (true && true && (true ||false)));
		
		
		
		
		
		

	}

}
