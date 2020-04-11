package week10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



public class Example {
	
			
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>();
			list.add("Steve");
			list.add("Bill");
			list.add("Amin");
			list.add("Elon");
			ListIterator<String> listIterator = list.listIterator();
			System.out.println("List elements in forward direction: ");
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next() + " ");
			}
			System.out.println();
			System.out.println("List elements in backward direction: ");
			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous() + " ");
			}
			System.out.println();
		}
	}