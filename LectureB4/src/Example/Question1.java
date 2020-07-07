package Example;

class A implements B {
	public int methodB(int i) {
		return i += 80;
	}
}

interface B {
	int methodB(int i);
}

public class Question1 {
	public static void main(String[] args) {
		B b = new A();
		System.out.println(b.methodB(9));
	}
}
