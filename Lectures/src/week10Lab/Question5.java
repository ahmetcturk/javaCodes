package week10Lab;

public class Question5 {

	String myString = "7007";
	
	public void doStuff(String str){
		int myNum = 0;
		
		try {
			String myString = str;
			myNum = Integer.parseInt(myString);
		} catch (NumberFormatException e) {
			System.err.println("Error");
		}
		System.out.println("myString : " + myString + ", myNum : " + myNum);
	}
	
	public static void main(String[] args) {
		Question5 obj = new Question5();
		obj.doStuff("9009a");

	}

}
