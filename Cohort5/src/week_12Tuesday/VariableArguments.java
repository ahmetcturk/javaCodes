package week_12Tuesday;

public class VariableArguments {
	// We are using this concept when there might be different number of argument 
	// we can provide for the method
	// Var-args needs to be always the last parameter in parameter list
	static void method(int b, String ...a){
		System.out.println(b);
		for (String string : a) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		method(9,"a", "a","c");
		method(7, "b", "c","d","e");// .... 
	}

}
