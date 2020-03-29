package week6;

public class StaticEx {
	
	int counter1;
	static int counter2;
	
	void counter(){
		counter1 ++;
		counter2++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx object1 = new StaticEx(), object2 = new StaticEx(),object3 = new StaticEx();
		
		object1.counter();
		// object1 = counter1 : 1, counter2 : 1
		object1.counter();
		// object1 = counter1 : 2, counter2 : 2
		object2.counter();
		// object2 = counter1 : 1, counter2 : 3
		object3.counter();
		// object3 = counter1 : 1, counter2 : 4
	
		System.out.println("This is non-static counter object1 : "  + object1.counter1);
		System.out.println("This is non-static counter object2 : "  + object2.counter1);
		System.out.println("This is static counter object1 : "  + object1.counter2);
		System.out.println("This is static counter object2 : "  + object2.counter2);
		
		

		
	}

}
