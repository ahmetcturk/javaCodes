package myFirstPackage;

import java.awt.TexturePaint;

public class IfBlocks {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// if blocks -- if blocks creates a conditional programs
		// true - false
		if(true){ // paranthesis only accepts boolean expressions
		System.out.println("Hello Silicone Labs");
		}
		
		// conditons as a boolean
		boolean myBoolean = true;
		if (myBoolean){
			System.out.println("Hello from inside of the second if block");
		}
		
		// condition as an expression
		int a = 9;
		int b = 9;
		if (a == b) {
			System.out.println(a +  " is equals to " + b);
		}
		
		// condition as an expression
		boolean myBoolean2 = true;
		boolean myBoolean3 = true;
		
		if (myBoolean2 && myBoolean3 && true &&(true || false)) {
			System.out.println("Hello from the inside of the 4th if block");
		}
		
		
	}

}
