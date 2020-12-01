package week6Tuesday;


class Class3{
	int a;
	String bString; 
	// create a method which initialize 2 fields
	void initializer(int a , String bString){
		this.a = a;
		this.bString = bString;
	}
}



public class Initializing_2 {

	public static void main(String[] args) {
		Class3 ref = new Class3();
		ref.initializer(9, "String");

	}

}
