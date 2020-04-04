package Lab9;

interface A5{
	int number = 9;
	void interfaceMethod();
}
class B5 implements A5{

	@Override
	public void interfaceMethod() {
		System.out.println("B");
		
	}
	
}
public class Example implements A {
	@Override
	public void interfaceMethod() {
		System.out.println("Method from example class");
		
	}
	public static void main(String[] args) {
		A5 a = new A5() {

			@Override
			public void interfaceMethod() {
				System.out.println("Method from interface reference");
			}
			
		};
		
			a.interfaceMethod();
		
		
	}

	

}
