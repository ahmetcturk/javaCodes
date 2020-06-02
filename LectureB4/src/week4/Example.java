package week4;

public class Example {

	
//  access modifier
//		^	access specifier
//		^	 ^	return type
//		^    ^     ^    Method name
//		^    ^     ^    ^     parameter
//		^    ^     ^    ^        ^
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Hey");
		StringBuffer sb2=sb1.append("Comeon");
		System.out.println(sb1.equals(sb2));//true
		System.out.println(sb2);
	}
}
