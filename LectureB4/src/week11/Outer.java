package week11;

public class Outer {
	private int data = 30;
	
	void display(){
		
		class Local{
			
			void msg(){
				System.out.println("Data is : " + data);
			}
		}
		// Local Class finishes
		Local iLocal = new Local();
		iLocal.msg();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer().display();
	}

}
