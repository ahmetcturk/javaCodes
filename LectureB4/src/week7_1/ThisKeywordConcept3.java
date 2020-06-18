package week7_1;

class Example2{
	
	Example3 object1;
	
	public Example2(Example3 object1) {
		System.out.println("4)");
		this.object1 = object1;
		System.out.println("5) ");
		System.out.println("6)");
	}
	void display(){
		System.out.println("8)");
		System.out.println("9)" + object1.data);
		System.out.println("10)");
	}
}

class Example3{
	int data = 10;
	public Example3() {
		System.out.println("2)");
		System.out.println("3)");
		Example2 object = new Example2(this);
		System.out.println("7)");
		object.display();
		System.out.println("11 ) ");
	}
	
}

public class ThisKeywordConcept3 {

	public static void main(String[] args) {
		System.out.println("1)");
		Example3 example3 = new Example3();
		System.out.println("12)");
	}

}
