package week9Lab;

import java.util.*;

public class Main {

	public static void main(String args[]) throws InterruptedException {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new Vector<Integer>();

		// Arraylist Fill 10 Integers 1-10
		for (int i = 0; i < 10; i++) {
			list1.add((int) (Math.random() * 10 + 1));
		}

		// Linkedlist Fill 10 Integers 1-10
		for (int i = 0; i < 10; i++) {
			list2.add((int) (Math.random() * 10 + 1));
		}
		
		// Vector Fill 10 Integers 1-10
		for (int i = 0; i < 10; i++) {
			list3.add((int) (Math.random() * 10 + 1));
		}
		
		
		Iterator<Integer> iterator1 = list1.iterator();
		Iterator<Integer> iterator2 = list2.iterator();
		Iterator<Integer> iterator3 = list3.iterator();
		
		System.out.println("Arraylist : ");
		while(iterator1.hasNext()){
			System.out.print(iterator1.next() + " ");
		}
		System.out.println();
		System.out.println("Linkedlist : ");
		while(iterator2.hasNext()){
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();
		System.out.println("Vector : ");
		while(iterator3.hasNext()){
			System.out.print(iterator3.next() + " ");
		}
		

	}
}