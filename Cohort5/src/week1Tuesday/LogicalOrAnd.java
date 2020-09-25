package week1Tuesday;

public class LogicalOrAnd {

	public static void main(String[] args) {
		
		// && = And Operator : If left side and right side is true at the same time, 
		// the whole expression will be true. All other situations are false
		
		// || = Or operator : If one of the sides is true, whole expression is true
		// If all the sides are false, whole expression will be false, 
		
		System.out.println(true && false);
		System.out.println(true && true && true && false);
		System.out.println(true && 9>8 && 9!=0); // true
		System.out.println(true && 9>8 && 9==0); // false
		
		System.out.println("=============================");
		
		boolean myBoolean1, myBoolean2;
		
		myBoolean1 = true || false;
		
		System.out.println(((myBoolean1 || 9>8) || false) && false);
		
		
	}

}
