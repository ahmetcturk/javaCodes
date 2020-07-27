package week_12Recap;

import javax.management.remote.SubjectDelegationPermission;

class SuperClass{
	void method(){
		System.out.println("1");
	}
	void method2(){
		System.out.println("2");
	}
}

class SubClass extends SuperClass{
	void method(){
		System.out.println("3");
	}
	void method4(){
		System.out.println("4");
	}
}

public class ClassCasting {

	public static void main(String[] args) {
		// Upcasting
		SuperClass ref1 = new SubClass();
		
		SubClass subClass =  new SubClass();
		
	//	SuperClass superClass = subClass;
		
		SuperClass	superClass = (SuperClass)subClass;
		
		ref1.method();
		
		superClass.method();
		superClass.method2();
		
		// Downcasting
		
		SuperClass superClass2 = new SubClass();
		
		((SubClass)superClass2).method4();
		((SubClass)superClass2).method();
		((SubClass)superClass2).method();
		
		
		
	
		
		
		
	}

}
