package week6;

import java.util.ArrayList;

public class StaticBlocks {
static int variable =9;
static ArrayList<String> list = new ArrayList<String>();

static{
	// if a class has static members that require complex initialization
	
	System.out.println("Hello World");
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	
}

static{
	System.out.println("Hello from static block");
}

public static void main(String[] args) {
System.out.println(list);
}

}
