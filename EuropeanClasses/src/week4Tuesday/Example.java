package week4Tuesday;

import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("open", 
				"/Users/siliconelabs/Documents/The Following "
				+ "Program computes and prints  out the average "
				+ "integers from 1 to 10.docx").start();
	}

}
