package April15;
class A{
	public A(){
		System.out.println("A ");
	}
	
}

class B extends A{
	public B(){
		System.out.println("B ");
	}
	
}

public class Question27 extends B{
	public Question27(){
		System.out.println("C ");
	}

	public static void main(String[] args) {
		
		A object = new Question27();
		

	}

}
