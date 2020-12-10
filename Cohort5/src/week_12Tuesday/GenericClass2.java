package week_12Tuesday;


class TwoValue<E,U>{
	E e;
	U u;	
	public TwoValue(E e,U u) {
		this.e = e; 
		this.u = u;
	}
}

public class GenericClass2 {

	public static void main(String[] args) {
		TwoValue<Integer, String> object = new TwoValue<Integer, String>(4298, "Ahmet");
		System.out.println(object.e);
		System.out.println(object.u);
	}

}
