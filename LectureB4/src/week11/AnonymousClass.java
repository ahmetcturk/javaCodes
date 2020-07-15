package week11;

interface  IPhone{
	abstract void call();
	abstract void close();
}

public class AnonymousClass {

	public static void main(String[] args) {
		IPhone iPhone = new IPhone() {
			@Override
			public void call() {
				System.out.println("Hey Siri.");		
			}
			@Override
			public void close() {
				System.out.println("Bye.");		
			}
		};
		
		iPhone.call();
		iPhone.close();

	}

}
