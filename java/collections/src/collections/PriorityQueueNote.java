package collections;

import java.util.*;

public class PriorityQueueNote {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // Default it works as a MinHeap (Give priority lowest value of list) 
		
		// Now it works Priority Queue Works as MaxHeap
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(10);
		pq.offer(25);
		pq.offer(7);
		pq.offer(55);
		pq.offer(30);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
		System.out.println("Poll: " + pq.poll());
		System.out.println("After Poll: " + pq);
	}
}
