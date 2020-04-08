package week10;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Akar");
		priorityQueue.add("Huseyin");
		priorityQueue.add("Mehmet");
		priorityQueue.add("Firat");
		priorityQueue.add("Shefika");
		priorityQueue.add("Ayla");
		priorityQueue.poll();
		priorityQueue.poll();
		priorityQueue.poll();
		priorityQueue.remove();
		Iterator iterator = priorityQueue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
