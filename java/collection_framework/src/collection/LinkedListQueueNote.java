package collection;

import java.util.*;

public class LinkedListQueueNote {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Lily"); // Add element in queue
		queue.offer("Rose");
		queue.offer("Lotus");
		
		// It also add element, but if not success,throws exception
		// queue.add("Lotus"); 
		
		System.out.println(queue);
		
		System.out.println(queue.poll()); // last out
		
		System.out.println(queue.peek()); // see which element next out
		
		System.out.println(queue);
	}
}
