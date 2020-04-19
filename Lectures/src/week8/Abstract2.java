package week8;


abstract class Base1 {
	abstract void get(int a, int b);
	abstract void add();
	abstract void display();
	
}

class SubClass1 extends Base1{
	
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