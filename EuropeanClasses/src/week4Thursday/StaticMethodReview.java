package week4Thursday;

public class StaticMethodReview {
	// Methods are collection of statements which only runs when it called. 
	
//  access modifier                         :private, public, default, protected
//		^	access specifier-modifier       :static - non-static
//		^	 ^	return type                 :void - All Data Types(int, double.. String, Objects)
//		^    ^     ^    Method name
//		^    ^     ^    ^     parameter list
//		^    ^     ^    ^        ^
	public static void main(String[] args) {
		// Method signature : method name and arguments
		// Method body : Collection of the statements between curly bracelets
		// Method header : Method header is defining characteristic of the method,
		// it includes access modifiers, return type, method name and parameter list
		//     Argument
		method("Mehmet");

	}
	//                  Parameter  
	static void method(String name){
		System.out.println(name);
	}
	
	

}
