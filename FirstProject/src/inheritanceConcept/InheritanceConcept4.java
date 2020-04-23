package inheritanceConcept;

class Superclass1{
	int x;
	String y;
	public Superclass1(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Superclass1() {
		
	}
	
}
class Subclass1 extends Superclass1{
	int a ;
	String b;
	public Subclass1(int x, String y, int a1, String b1) {
		super(x, y);
		this.a = a1;
		this.b = b1;
		
	}
	
}
public class InheritanceConcept4 {

	public static void main(String[] args) {

	}

}
