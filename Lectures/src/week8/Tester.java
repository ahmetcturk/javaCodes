package week8;

class sta{
	static int x;
	static int y;
	void add(int a, int b){ // a = 2, b= 3 ---- a = 5 , b = 2 ---- a=7, b=2
		x = a+b; // x = 5 ---- x = 7 -------x=9
		y = x+b; // y = 8 ---- y = 9--------y = 11
	}
}

public class Tester {


	public static void main(String[] args) {
		sta object = new sta();
		sta object1 = new sta();
		
		int a = 2;
		object.add(a, a+1);
		object1.add(5, a);
		object1.add(7,a);
		System.out.println(object1.x + " " + object1.y) ;
	
	}

}
