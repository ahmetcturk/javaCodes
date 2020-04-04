package week9;

public class Main1 {
	public static void main(String[] args) {
		
		
        String str = "Silicone Labs";
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
	}
}
