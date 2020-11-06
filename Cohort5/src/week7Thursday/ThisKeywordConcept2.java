package week7Thursday;


class Example1{
	int number = 10;
	void method1(Example1 object){
		System.out.println("Method has been called");
		System.out.println(object.number);
		
	}
	void method2(){
		//Example1 object = new Example1();
		//this.method1(object);
		this.method1(this);
	}
}

public class ThisKeywordConcept2 {

	public static void main(String[] args) {
		new Example1().method2();

	}

}
