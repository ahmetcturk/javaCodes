package week_12Tuesday;

public class GenericMethods {
	// Generic methods are methods that can accept different kind of parameters
	
	
	static <E> void print(E element){
		System.out.println(element.getClass().getName());
	}
	
	static <E> E printAgain(E element){
		return element;
	}
	
	public static void main(String[] args) {
		print("String");
		print(44);
		print(42.98);
		
		System.out.println(printAgain(true));
	}

}
