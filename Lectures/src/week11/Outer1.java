package week11;

public class Outer1 {

	private int data = 30;
	
	void display() {
		class Local {
			void msg() {
				System.out.println("Value is : " + data);
				main1();
			}
		}
		Local local1 = new Local();
		local1.msg();

	}

	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.display();
	}
	
	public static void main1() {
		
	}

}
