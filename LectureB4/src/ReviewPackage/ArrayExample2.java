package ReviewPackage;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String stringArray [] = {"String", "Java", "Selenium", "String"};
		
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i+1; j < stringArray.length; j++) {
				if (stringArray[i].equals(stringArray[j])) {
					System.out.println(stringArray[i]);
				}
			}
		}
		
	}

}
