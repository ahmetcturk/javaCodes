package Example;

public class Main2 {
	

	static int countString(String str, String toFind) {
		int count = 0;
		
		String[] arr = str.split(" ");
		for (String i : arr) {
			//System.out.println(i);

		}
		for (int i1 = 0; i1 < arr.length; i1++) {
			if (arr[i1].contains(toFind)) {
				count++;
			}
		}
		return count;
	}

	// test case below (dont change):
	public static void main(String[] args){
		//System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		//System.out.println(countString("sometimes solutions dont come on time", "me")); //4
		

}
}