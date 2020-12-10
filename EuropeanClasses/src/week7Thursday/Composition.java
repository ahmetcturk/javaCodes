package week7Thursday;

class A{
	int a = 4298; 
	String name = "Ahmet";
}

public class Composition {
	
	// Having a field of other classes reference
	A aObject = new A();

	public static void main(String[] args) {
		Composition compObject = new Composition();
		
		System.out.println(compObject.aObject.a);
		 
		
	}

}
