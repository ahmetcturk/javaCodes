package ReviewPackage;

// Decision Making programs
public class SwitchCaseReview {

	public static void main(String[] args) {
		// Switch case programs are consist of key, value, and cases
		// key can be : int, char and string
		
		int key =0 ;
		
		switch (key) {
		
		case 1 : System.out.println("GO TO MAIN PAGE"); // 1 is the value
				break;
		case 2 : System.out.println("GO TO YOUR PROFILE");// 2 is the value
				break;
		case 3 : System.out.println("GO TO SETTINGS");// 3 is the value
				break;
		default : 
			    System.out.println("STAY IN THE SAME PAGE");
		}
		
	}

	
	
}
