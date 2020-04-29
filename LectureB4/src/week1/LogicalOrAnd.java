package week1;

public class LogicalOrAnd {

	public static void main(String[] args) {
		
		boolean myBoolean1, myBoolean2, myBoolean3, myBoolean4, myBoolean5, myBoolean6, 
		 myBoolean7, myBoolean8;
		
		// && - If left side and right sides are true at the same time, 
		// the whole expression is going to be true, otherwise, it will be false
		myBoolean1 = true && false; // false
		myBoolean2 = true && true ; // true
		
		// || - If at least one of the sides are true, whole expression is true
		// otherwise, expression is false
		
		myBoolean3 = true || false ; // true
		myBoolean4 = false || false; // false
		
		myBoolean5 = myBoolean3 || myBoolean2;  // True
		myBoolean6 = myBoolean1 && myBoolean5; //  False
		
		myBoolean7 = (myBoolean5 && myBoolean2) || (myBoolean3 || myBoolean4 || myBoolean6); // True
		
		boolean username = true, password = false;
		
		System.out.println(username && password); // False
		
		

	}

}
