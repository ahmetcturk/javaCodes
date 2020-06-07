package ReviewPackage;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		// Difference between Stringbuffer - String
		// String Buffer is mutable hence strings are immutable
		// Stringbuffers are synchronized
		// Thread-Safe
		StringBuffer stringBuffer = new StringBuffer("Java Classes");
		
		//System.out.println(stringBuffer.reverse());
		
		System.out.println(stringBuffer.append(" 2020"));

		
		// Stringbuilder is comparatively faster than Stringbuffer
		// Non- synchronized , non-ThreadSafe
		StringBuilder stringBuilder = new StringBuilder("Selenium Classes");
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		
		
	}

}
