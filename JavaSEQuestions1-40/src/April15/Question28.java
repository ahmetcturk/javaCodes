package April15;

public class Question28 {
	static int i ;
	int j;

	public static void main(String[] args) {
		
		Question28 x1 = new Question28();
		Question28 x2 = new Question28();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j =6;
		System.out.println(	x1.i + " " +  // static 5
							x1.j + " " +  // int	4
							x2.i + " " +  // Static	5
							x2.j);		  // int	6

	}

}
