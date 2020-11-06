package week2Thursday;

public class WarmUp {

	public static void main(String[] args) {
		
		// Switch Case - String Class
		
		int key = 9;
		String name = "Silicone Labs";
		
		switch (key) {
		case 9:
			name = name.toUpperCase();
			break;
		case 4:
			name = name.toLowerCase();
			break;
		default:
			name = name.substring(0,8);
			break;
		}
		
		System.out.println(name.length());
		
		

	}

}
