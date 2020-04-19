package April16;

public class Question37 {
	
	static int count = 0;
	int i = 0;
	
	public void changeCount(){
		while(i<5){
			i++;
			count++;
		}
	}
	

	public static void main(String[] args) {
		Question37 test1 = new Question37();
		Question37 test2 = new Question37();
		
		test1.changeCount();
		test2.changeCount();
		System.out.println(test1.count + ":" + test2.count);
		

	}

}
