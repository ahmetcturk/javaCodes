package week10;

public class ExceptionHandlingConcept2 {

	public static void main(String[] args) {

		try {
			System.out.println(9 / 0);
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[10]);
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out of bound exception handled");
		} 
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		} 
		catch (Exception e) {
			System.out.println("Exception Handled");
		}

	}

}
