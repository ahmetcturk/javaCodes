package week6Tuesday;

public class Overview {
	
	int number;
	String name;
	
	void method(){
		System.out.println(number);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		// Classname referenceName = new Classname();
		Overview ref = new Overview();
		ref.number = 9;
		ref.name = "Object1";
		System.out.println(ref.number);
		System.out.println(ref.name);
		
		Overview ref2 = new Overview();
		ref2.number = 100;
		ref2.name = "Object2";
		System.out.println(ref2.number);
		System.out.println(ref2.name);
		
		ref.method(); // 9 Object1
		ref2.method(); // 100 Object2
	}

}
