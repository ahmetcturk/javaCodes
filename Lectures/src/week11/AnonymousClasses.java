package week11;

interface A{
	void print(String string);
}
public class AnonymousClasses implements A {

	public static void main(String[] args) {
		A a = new A() {
			
			@Override
			public void print(String string) {
				System.out.println("This is the string : "  + string);
				
				
			}
		};
		a.print("Ahmet");
	}

	@Override
	public void print(String string) {
		System.out.println(string);
		
	}

}
