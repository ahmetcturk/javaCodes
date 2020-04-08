package week10;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Zeynep");
		treeSet.add("Linda");
		treeSet.add("amanda");
		treeSet.add("Grace");
		treeSet.add("shalin");
		treeSet.add("bob");
		treeSet.add("James");
		System.out.println(treeSet);
		
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		treeSet1.add(4);
		treeSet1.add(3);
		treeSet1.add(7);
		treeSet1.add(8);
		treeSet1.add(9);
		System.out.println(treeSet1);
	}

}
