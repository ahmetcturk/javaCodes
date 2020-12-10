package week7Thursday;
// Super Keyword is working like a reference for super class
// 1) Calling super class field
// 2) Calling super class method
// 3) Invoking super class constructor super()

class SuperClass2{
	int a = 4298;
	void method(){
		System.out.println(1);
	}
}
class SubClass2 extends SuperClass2{
	int a = 4306;
	void method(){
		System.out.println(a); // 4306
		System.out.println(super.a); //4298
	}
	void method2(){
		method(); // 4306,4298
		super.method(); //1
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		new SubClass2().method2();
		new SubClass2().method();
	}

}
