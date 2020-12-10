package week7Tuesday;

class A1{
	// Anonymous blocks - Instance Initializing blocks, they run before constructor
	{
		System.out.println(1);
	}
}
class B1 extends A1{
	{
		System.out.println(2);
	}
}
class C1 extends B1{
	{
		System.out.println(3);
	}
}
public class Blocks {
	
	public static void main(String[] args) {
		
		C1 obj = new C1();

	}
	
	
}
