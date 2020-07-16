package week_11Wednesday;


@FunctionalInterface
interface FuncInterface{
	void abstractFunctional(String x);
	
	default void normalMethod(){
		System.out.println("Hey");
	}
}
// Create a functional interface, have abstract void method name is square(int a). 
// Complete the implementation with lambda expression. call the method afterwise
// Sample input = 9, output = 81
@FunctionalInterface
interface Square{
	void sqare(int x);
}

public class Lambda_1 {

	public static void main(String[] args) {
		FuncInterface reference = (String a) -> System.out.println(a + "!");
		
		reference.abstractFunctional("Message");
		
		Square reference2 = (int a) -> System.out.println(a * a);
		reference2.sqare(88);

	}

}
