package April15;

public class Question30 {

	public static void main(String[] args) {
		
		String arr[] = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");   // A,B
			if (arr[i].equals("C")) {			// A!=C
				continue;						// Continue
			}
			System.out.println("Work done");	//A Workdone
			break;
		}

	}

}
