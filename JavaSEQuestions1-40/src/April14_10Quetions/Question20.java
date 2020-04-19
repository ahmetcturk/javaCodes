package April14_10Quetions;

public class Question20 {
	
public static boolean isAvailable (int x){
	return x-- > 0? true :false;
}
	

	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)){
			System.out.print(x);
			x--;
		}
		
		

	}

}
