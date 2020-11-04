package week7Tuesday;

public class Test {

	public static void main(String[] args) {
		SubClass subObject = new SubClass();
		subObject.subClassVar = 90;
		// object.superClassVar = 900; compilation error
		subObject.lastname = "String";
		subObject.name = "String";
		subObject.SCMethod();
		subObject.SubMethod();
		
		SuperClass supObject = new SuperClass();
		// object2.superClassVar = 990; compilation error
		supObject.lastname = "String";
		
		supObject.SCMethod();

		subObject.SubMethod2();
		
	}

}
