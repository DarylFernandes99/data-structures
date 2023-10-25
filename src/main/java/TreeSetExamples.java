package main.java;

import java.util.*;

public class TreeSetExamples {
	public static void main(String[] args) {
		// TreeSets cannot add any duplicate values
		// in the custom order case as string length is the key factor "wolf" cannot be added since it has the same length as "bear"
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(300);
		treeSet.add(47);
		treeSet.add(6);
		
		// TreeSet by default stores in ascending order and does not store duplicate values
		System.out.println(treeSet);
		treeSet.add(6);
		System.out.println(treeSet);
		
//		Set<String> wordSet = new TreeSet<>();
		// To sort by custom order
		Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));
		wordSet.add("tiger");
		wordSet.add("giraffe");
		wordSet.add("bear");
		
		System.out.println(wordSet);
		wordSet.add("wolf");
		System.out.println(wordSet);
		
		// Remove from treeset
		wordSet.remove("giraffe");
		System.out.println(wordSet);
	}
}
