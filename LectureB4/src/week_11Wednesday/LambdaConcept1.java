package week_11Wednesday;
// This example demonstrates what kind of functionality does my lamda expression have
interface FunctionalInterfac{
	String message();
}

class Aclass implements FunctionalInterfac{

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello";
	}
	
}

public class LambdaConcept1 {

	public static void main(String[] args) {
		
		FunctionalInterfac reference = new FunctionalInterfac() {
			@Override
			public String message() {
				// TODO Auto-generated method stub
				return "Hello From Anonymous Class";
			}
		};
		
		System.out.println(reference.message());
		
		
		// Lambda Expression
	//  FIName				refName		PList	"Implementation "		
		FunctionalInterfac reference1 = () -> ("Hello");
		System.out.println(reference1.message());
		
	}
	
	

}
