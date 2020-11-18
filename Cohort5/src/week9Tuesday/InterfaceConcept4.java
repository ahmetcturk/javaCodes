package week9Tuesday;


interface IPhone{
	static void message(){
		System.out.println("This is a static method from IPhone interface");
	}
	default void message2(){//public
		System.out.println("This is a default method from interface");
	}
}

public class InterfaceConcept4 implements IPhone {
	public void message2(){
		System.out.println("Overriden default method");
	}
	public static void main(String[] args) {
		IPhone.message();
		IPhone phone = new InterfaceConcept4();
		phone.message2();
		

	}

}
