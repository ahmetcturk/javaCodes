package week11Lab;

public class Question37 {
static int count = 0;
int i = 0;
public void changeCount(){
	while (i<5) {
		i++;
		count++;
	}
}
	public static void main(String[] args) {
	
		Question37 check1 = new Question37();
		Question37 check2 = new Question37();
		
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.i + " : " + check2.count+ " : " + check1.count);
		
		int array []; array = new int[2];
		
	}
}
