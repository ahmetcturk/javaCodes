package week_10Tuesday;

public class ExceptionhandlingConcept7 {

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception thrown from the method");
		}
	}
	
	static void method() throws Exception{
		throw new Exception(); // Creating exception object
	}

}
