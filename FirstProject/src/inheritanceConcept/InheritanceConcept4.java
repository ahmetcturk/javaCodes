package inheritanceConcept;

class Superclass1 {
	int x;
	String y;
	public Superclass1(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}

class Subclass1 extends Superclass1 {
	int a;
	String b;
	public Subclass1(int x, String y) {
		super(x, y);
	}
	public Subclass1(int x, String y, int a , String b) {
		super(x, y);
		this.a = a;
		this.b = b;
	}
	
}

public class InheritanceConcept4 {

	public static void main(String[] args) {

	}

}
