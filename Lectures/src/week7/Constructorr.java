package week7;

public class Constructorr {
	public static void main(String[] args) {
		SecondClass object = new SecondClass();
	}
}
class FirstClass{
	public FirstClass() {
		System.out.println("First");
	}
}
class SecondClass extends FirstClass{
	public SecondClass() {
		System.out.println("Second");
	}
}
class ThirdClass extends SecondClass{
	public ThirdClass() {
		System.out.println("Third");
	}
}



