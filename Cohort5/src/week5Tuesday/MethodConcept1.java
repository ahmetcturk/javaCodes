package week5Tuesday;

import java.util.Scanner;


public class MethodConcept1 {	
	
//  access modifier : public - private - protected - default
//		^	access specifier : static - non-static(default)
//		^	 ^	return type : void - int - String - Double... all kind of data types
//		^    ^     ^    Method name : Developer decides this (identifier)
//		^    ^     ^    ^     parameter : Can be any data type
//		^    ^     ^    ^        ^	
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//int arr [] = new int [4];
		// Formula : ClassName objectName = new ClassName();
		MethodConcept1 myObject1 = new MethodConcept1();
		
		myObject1.printNumber();
	}
	
	void printNumber(){
		System.out.println(1);
	}
	
	
	
	
	

}
