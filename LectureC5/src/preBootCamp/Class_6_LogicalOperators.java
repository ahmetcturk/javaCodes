package preBootCamp;

public class Class_6_LogicalOperators {

	public static void main(String[] args) {
		
		// && , || , ! 
		
		
		// || (Or) : If one of the sides are true, the whole expression will be true, 
		// otherwise it will be false
		
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println(true || false); // true
		System.out.println(false || true || false); // true
		
		System.out.println((4!= 9) || (6>9)); // true
		
		
		// && (And) : If one of the sides are false, the whole expression will be false,
		// otherwise (all sides are true) it will return true
		
		System.out.println(true && true); // true
		System.out.println(false && false); // false
		System.out.println(true && false); //false
		System.out.println(false && true && false); // false
		
		System.out.println(((5==9) && (9>8)) || (true)); // true
		
		System.out.println((5==9) && ((6>9) || (true))); // false
		
		
	}

}
