package week9;

interface HasBody{
	default void first(){
		System.out.println("This is the first default method");
	}
	default void second(){
		System.out.println("This is the second default method");
	}
    void third();
}
public class Demo implements HasBody {
	public void first(){
		System.out.println("This is the first implementation of default method");
	}
	public void second(){
		System.out.println("This is the second implementation of default method");
	}
	
	public void third(){
		System.out.println("This is the third implementation");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.first();
		demo.second();
		demo.third();

	}

}
