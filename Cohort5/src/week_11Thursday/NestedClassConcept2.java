package week_11Thursday;

class Outer2{
	void display(){
		class Local{
			void msg(){
				System.out.println("Message in local class");
			}
		}
		
		// Local class finishes here
		new Local().msg();
		
	}
}


public class NestedClassConcept2 {

	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		outer2.display();
	}

}
