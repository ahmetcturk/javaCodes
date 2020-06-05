package week5;

public class Recab1 {

	public static void main(String[] args) {
		
		int number = method1(10) + 10;
		System.out.println(number);
	}

	public static int method1(int a){
		System.out.println("This method starting to work");
		
		System.out.println("We are adding 10 into our parameter");
		a = a + 10;
		System.out.println("We are returning a");
		return a;
		
	}
}
