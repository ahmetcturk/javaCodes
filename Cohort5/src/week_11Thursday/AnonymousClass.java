package week_11Thursday;

interface IPhone{
	void msg();
}

public class AnonymousClass {

	public static void main(String[] args) {
		IPhone obj = new IPhone() {
			
			@Override
			public void msg() {
				System.out.println("This is anonymous class");
				
			}
		};
		// Lambda expressions will work only 
		// if interface has one abstract method(functional interface)
		IPhone obj2 = () -> System.out.println("This is method");
		
		obj.msg();
		obj2.msg();

	}

}
