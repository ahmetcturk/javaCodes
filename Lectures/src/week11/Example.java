package week11;

public class Example {

	public static void main(String[] args) {
		String[][] chs = new String[3][];
		chs[0] = new String[3];
		chs[1] = new String[5];
		chs[2] = new String[3];
		int i = 97;

		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {
				chs[a][b] = "" + i;
				i++;
			}
		}
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.println(c + " ");
			}
		}
		System.out.println();
	}
}