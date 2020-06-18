package week7_1;
// This example demonstrates this keyword as argument
class Example1{
	int number = 10;
	void method1(Example1 object){
		System.out.println("Method has been called");
		System.out.println(object.number);
	}
	
	void method2(){
		//Example1 object = new Example1();
		// using this keyword as an argument
		method1(this);
	}
	
}

public class ThisKeywordConcept2 {

	public static void main(String[] args) {
		Example1 object = new Example1();
		object.method2();
	}

}
