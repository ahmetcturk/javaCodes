package week7Thursday;

 // 1) In order to invoke superclass constructor, we use super()
 // 2) In order to call super class method, we use super.method()
 // 3) In order to access to superclass field, we use super.field

class SuperClass1{
	int number = 10;
	void play(){
		System.out.println("Playing SuperClass");
	}
}

class SubClass1 extends SuperClass1{
	int number = 900;
	void play(){
		super.play();
		System.out.println(super.number);
	}
}

public class SuperKeywordConcept2 {

	public static void main(String[] args) {
		SubClass1 object = new SubClass1();
		object.play();
	}

}
