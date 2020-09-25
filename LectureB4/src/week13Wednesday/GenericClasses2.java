package week13Wednesday;


class TwoValue <E,U>{
	
	E e;
	U u;
	public TwoValue(E e, U u) {
		this.e = e;
		this.u = u;
	}
}




public class GenericClasses2 {

	public static void main(String[] args) {
		TwoValue<Integer, String> object = new TwoValue<Integer, String>(42,"98");
		System.out.print(object.e + object.u);
	}

}
