package week7Thursday;
// this() -> invokes classes constructor
// this.field -> access to classes field
// this.method() -> invokes the classes method


class myClass{
	int intField;
	public myClass(int intField) {
		this.intField = intField; //-> this.field accessing field in myClass
		this.method(); // this is invoking method()
	}
	
	public myClass() {
		this(9); // this is invoking myClass one parameter constructor
	}

	void method(){
		System.out.println(this.intField);
	}
}

public class ThisKeywordConcept {

	public static void main(String[] args) {
		

	}

}
