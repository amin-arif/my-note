package collection;

import java.util.*;

// This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
public class ArrayDequeNote {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(20);
		adq.offerFirst(44); // Add first element of the array
		adq.offerLast(85); // // Add last element of the array
		adq.offer(15);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println("Peek First: " + adq.peekFirst());
		System.out.println("Peek Last: " + adq.peekLast() + "\n");
		
		System.out.println("Poll: " + adq.poll());
		
		System.out.println(adq);
		System.out.println("Poll Last: " + adq.pollLast()); // Remove last element from array
		System.out.println("Poll First: " + adq.pollFirst()); // Remove first element from array
		
		System.out.println(adq);
	}
}
