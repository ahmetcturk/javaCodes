package week11;

public class TernaryConcept {

	public static void main(String[] args) {

		int a, b;

		a = 10;
		
		/*
		if (a==1) {
			b = 20;
		} else {
			b = 30;
		}
		*/
		
		b = (a == 1 || false) ? 20 : 30;
		System.out.println("b = " + b);

		b = (a == 10) ? 40 : 10;
		System.out.println("b = " + b);
		
	}

}
