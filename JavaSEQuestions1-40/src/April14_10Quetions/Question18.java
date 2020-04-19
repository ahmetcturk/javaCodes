package April14_10Quetions;


//Which code fragment prints red: blue:small:medium?
public class Question18 {

	public static void main(String[] args) {
		
		String shirts [][]= new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		
		for (int i = 0; i < shirts.length; i++) {
			for (int j = 0; j < shirts.length; j++) {
				System.out.print(shirts[i][j] + ":");
			}
		}

//ForEach Loop
		
//		for(String [] s : shirts){
//			for (String a : s) {
//				System.out.print(a + ":");
//			}
//
//		}

	}

}
