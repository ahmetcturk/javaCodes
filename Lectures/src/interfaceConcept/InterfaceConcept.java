package interfaceConcept;

interface Iinterface{
	void msg();
}


class classB implements Iinterface{

	@Override
	public void msg() {
		System.out.println("Hello Silicone Labs");
	}
	
}


public class InterfaceConcept {

	public static void main(String[] args) {
		classB a = new classB();
		a.msg();
	}

}
