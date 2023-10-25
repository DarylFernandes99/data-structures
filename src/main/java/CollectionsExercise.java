package main.java;

import java.util.*;

public class CollectionsExercise {
	public void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
//		numbers.add(i);
		numbers.addLast(i);
	}
	
	public void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
		numbers.addFirst(i);
	}
	
	public void removeItemFromTopOfStack(Deque<Integer> stack) {
		stack.pop();
	}
	
	public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
		queue.poll();
	}
	
	public void addItemToTreeSet(Set<String> set, String item) {
		set.add(item);
	}
}
