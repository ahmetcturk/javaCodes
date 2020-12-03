package week6Thursday;

public class Overview {
	int a;
	// Constructors are special methods which we use in order to initialize objects
	// If there is no constructor defined explicitly, java provides a default constructor
	
	public Overview() {
		// It will work whenever i create object with using no parameter const
		System.out.println("This is constructor");
	}
	
	public Overview(int a) {
		// It will work whenever i create object with using no parameter const
		System.out.println("This is one parameter constructor");
		this.a = a;
	}
	
	public static void main(String[] args) {
		Overview ref = new Overview();
		Overview ref2 = new Overview(5);
		System.out.println(ref.a);
		System.out.println(ref2.a);

	}

}
