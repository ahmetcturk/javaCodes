package April16;

public class Question36 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
		//String str2 = new String(str1);
		//String str2 = sb1.toString();
		//String str2 = "Duke";
		System.out.println(str1 == str2);
		

	}

}
