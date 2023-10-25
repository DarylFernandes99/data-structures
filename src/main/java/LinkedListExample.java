package main.java;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// LinkedLists always store elements in order
		LinkedList<String> shoppingList = new LinkedList<String>();
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("pear");
		shoppingList.add("orange");
		
		System.out.println(shoppingList);
		
		shoppingList.add(1, "Mango");
		System.out.println(shoppingList);
		
		shoppingList.removeFirst();
		System.out.println(shoppingList);
		shoppingList.removeLast();
		System.out.println(shoppingList);
		
		List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
		System.out.println(synchronizedShoppingList);
	}
}
