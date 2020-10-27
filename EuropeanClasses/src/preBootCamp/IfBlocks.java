package preBootCamp;

public class IfBlocks {

	public static void main(String[] args) {
		
		if(false){
		System.out.println("1");
		System.out.println("2");
		}
		
		
		int x = 10;
		
		System.out.println(x); // 10
		
		if(false){
			x = 100; 
			System.out.println(x); // 100
			x = 99;
		}
		
		System.out.println(x); //10
		
		
		
		int age = 18;
		
		if (age >= 18) {
			System.out.println("You can vote");
		}
		
		
		boolean myUsername = true;
		
		if (myUsername) {
			System.out.println("Welcome");
		}
		
		
		boolean verifyTitle = false;
		
		if (verifyTitle) {
			System.out.println("Title verified");
		}
		
		
		
		
		

	}

}
