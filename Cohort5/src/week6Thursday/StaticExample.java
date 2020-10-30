package week6Thursday;

public class StaticExample {
	
	int number1;
	static int number2;
	
	public static void main(String[] args) {
		StaticExample obj = new StaticExample();
		obj.number1 ++;
		obj.number2 ++;
		
		StaticExample obj2 = new StaticExample();
		obj2.number1 ++;
		obj2.number2 ++;
		StaticExample.number2 ++;

		System.out.println("Object 1 number1 : " + obj.number1);
		System.out.println("Object 1 number2 : " + obj.number2);
		System.out.println("Object 2 number1 : " + obj2.number1);
		System.out.println("Object 2 number2 : " + obj2.number2);
		
		
		
	}

}
