package week_12Thursday;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// Stringbuilder is mutable like stringbuffer
		// Non-synchronized
		// Faster compare to String and stringbuffer
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("String Builder");
		
		System.out.println(stringBuilder.getClass().getName());
		
		System.out.println(stringBuilder.capacity());
		
		
		
		/*
		 * append()
		 * charAt()
		 * delete(int start, int end)
		 * deleteCharAt(int index)
		 * indexOf()
		 * lastIndexOf()
		 * length()
		 * reverse()
		 * setCharAt(int index, char c)
		 * substring()
		 * trimToSize
		 */

	}

}
