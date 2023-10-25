package main.java;

import java.util.*;

public class QueueExamples {

	public static void main(String[] args) {
//		Queue<String> queue = new ArrayDeque<>();
//		Queue<String> queue = new LinkedList<>();
		Queue<String> queue = new PriorityQueue<>();
		queue.offer("Person One");
		queue.offer("Person Two");
		queue.offer("Person Three");
		
		System.out.println(queue);
		
		// Shows the first item in the queue
		System.out.println(queue.peek());
		
		// Remove first element from queue
		// as the queue is of PriorityQueue type the array returned is sorted
		queue.poll();
		System.out.println(queue);
	}

}
