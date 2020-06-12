package week6Recap;

public class StaticExample1 {

	static int number;
	int number1;
	
	static void method1(){
		number++;
		//number1++;
	}
	
	void method2(){
		number++;
		number1++;
	}
	
	public static void main(String[] args) {
		StaticExample1 object1 = new StaticExample1();
		StaticExample1 object2 = new StaticExample1();
		object1.method2();
		object2.method2();
		StaticExample1.method1();
		System.out.println(object1.number1);
		System.out.println(object2.number1);
		System.out.println(StaticExample1.number);
		

	}

}
