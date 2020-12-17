package week_12Thursday;import java.util.concurrent.ConcurrentHashMap;

// Enums is collection of constants(final) variables

enum Constants{
	NUM1(1) , NUM2(2) , NUM3(3);
	int number;
	private Constants(int number){
		this.number = number;
	}
}

public class EnumConcept {
	
	public enum Credentials{
		USERNAME,PASSWORD, EMAIL
	}

	public static void main(String[] args) {
		Constants variable = Constants.NUM1;
		String string = Constants.NUM1.toString();
		
		for (Constants c : Constants.values()) {
			System.out.println(c.number);
		}
		
	}

}
