package week10;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// LinkedHashSet - Contains unique elements - It maintains insertion
		// order
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Turkey");
		linkedHashSet.add("Eagle");
		linkedHashSet.add("Piegon");
		linkedHashSet.add("Hawk");
		linkedHashSet.add("Twitter");
		linkedHashSet.add("Turkey");
		System.out.println(linkedHashSet);

	}

}
