package April15;

public class Question24 {

	public static void main(String[] args) {
		
		String [][] chs = new String[2][]; //[2] array sayisi
		chs[0] = new String[2];
		chs[1] = new String[5];
		
		
		int a = 97;

		
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				chs[i][j] = "" + a;
				a++;
			}

		}
		
		for(String [] ca : chs) {
			for (String c : ca){
				System.out.print(c + " ");
			}
			System.out.println();
		}
		

	}

}
