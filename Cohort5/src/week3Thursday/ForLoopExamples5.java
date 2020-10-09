package week3Thursday;

public class ForLoopExamples5 {

	public static void main(String[] args) {
		
		// continue : we are using continue statement to skip statements
		for (int i = 0; i < 10; i++) {
			if (!(i == 5)) {
				continue;
			}
			System.out.println(i);
		}

	}

}
