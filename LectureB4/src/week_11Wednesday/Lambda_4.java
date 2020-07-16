package week_11Wednesday;


@FunctionalInterface
interface FunctINterface2{
	int sum(int a, int b);
}

public class Lambda_4 {

	public static void main(String[] args) {
		
		FunctINterface2 reference = (a,b) -> (a+b);
		System.out.println(reference.sum(9, 8));
		

	}

}
