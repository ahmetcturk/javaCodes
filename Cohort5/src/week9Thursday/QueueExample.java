package week9Thursday;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Customer 1");
		queue.add("Customer 2");
		queue.add("Customer 3");
		
		for (String string : queue) {
			//System.out.println(string);
		}
		
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
		 System.out.println(iterator.next());
			
		}
		

	}

}
