package week9;

interface Walk{
	default void move(){
		System.out.println("Walk");
	}
}

interface Run{
	default void move(){
		System.out.println("Run");
	}
}
public class Tester1 implements Walk,Run{
	public static void main(String[] args) {
		Walk object = new Tester1();
		object.move();
	
	}

	@Override
	public void move() {
		System.out.println("Move quickly");
	}
	
	
}
