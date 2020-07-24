package week_11Recap;

// Anonymous classes (for abstract class or interface)

interface Example{
	int a = 9;
	abstract void method();
	abstract void method1();
}
public class AnonymousClass {

	public static void main(String[] args) {
		Example example = new Example() {
			
			@Override
			public void method1() {
				System.out.println("Method2");
				
			}
			@Override
			public void method() {
				System.out.println("Method1");
			}
		};
		
		example.method();
		example.method1();
		System.out.println(example.a);

	}

}
