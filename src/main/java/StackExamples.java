package main.java;

import java.util.*;

public class StackExamples {
	public static void main(String[] str) {
		
		// Using stack would print the array in normal way whereas in deque it prints in reverse order
		Deque<String> stack = new ArrayDeque<String>();
		stack.push("First request");
		stack.push("Second request");
		stack.push("Third request");
		
		System.out.println(stack);
		
		// Get the top element
		System.out.println(stack.peek());
		
		// Pop the top element
		// difference between pop and poll, when empty pop will throw no such element exception whereas poll will return null
		stack.pop();
		System.out.println(stack);
		
		stack.poll();
		System.out.println(stack);
	}
}
