package week8;


public abstract class Abstract2 {
	abstract void get(int a, int b);
	abstract void add();
	abstract void display();
	
}

class SubClass1 extends Abstract2{
	
	int x,y,z;
	@Override
	void get(int a, int b) {
		x = a;
		y = b;
	}
	@Override
	void add() {
		z = x+y;
		
	}
	@Override
	void display() {
		System.out.println("The addition is : " + z);
		
	}
	

	
	
}