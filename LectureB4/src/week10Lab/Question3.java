package week10Lab;

class App{
	
	String myStr = "7007";
	
	public void doStuff(String str){
		int myNum = 0;
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} 
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("myStr : " + myStr + ", myNum : " + myNum);
	}
	
	
	
}

public class Question3 {

	public static void main(String[] args) {
		App obj = new App();
		obj.doStuff("9009");
		System.err.println("Error");

	}

}
