package April16;

public class Question31 {
	
	int ns;
	static int s;
	
	Question31(int ns) {
		if (s<ns) {
			s=ns;
			this.ns=ns;
		}
	}
	void doPrint(){
		System.out.println( "ns = " + ns + "s = " + s);
	}

	public static void main(String[] args) {
		
		Question31 obj1 = new Question31(50);
		Question31 obj2 = new Question31(125);
		Question31 obj3 = new Question31(100);
		
		obj1.doPrint();
		obj2.doPrint();
		obj3.doPrint();
		

	}

}
