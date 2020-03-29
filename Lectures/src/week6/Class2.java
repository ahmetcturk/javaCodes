package week6;

public class Class2 {
	int x ;
	String y;
	
	public Class2() {
		System.out.println("You used the non parameter constructor to create your object");
	}

public Class2(int x, String y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("You used the 2 parameter constructor to create your object");
	}

public static void main(String[] args) {
	Class1 object1 = new Class1(3,"StringValue");
	Class2 object2 = new Class2(9,"Another String");
	Class2  object3 = new Class2();
	object3.x = 5;
	object3.y = "Java";
	
	
}

}
